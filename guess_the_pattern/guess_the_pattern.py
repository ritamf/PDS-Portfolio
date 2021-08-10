import cv2

import os
from random import random, randint

patterns = os.listdir("imgs/")
patternsArch = os.listdir("imgsArch/")

yay_counter = 0
round_counter = 0
while round_counter < 20:

    if random() > 0.4:
        pattern = patterns[randint(0, len(patterns)-1)]
        img = cv2.imread(f"imgs/{pattern}")

    else:
        pattern = patternsArch[randint(0, len(patternsArch)-1)]
        img = cv2.imread(f"imgsArch/{pattern}")

    pattern = pattern.split(".")[0][:-1]

    cv2.imshow("", img)
    cv2.waitKey(3 * 1000)

    guess = input()

    if guess.lower() == pattern:
        print("yay")
        yay_counter+=1

    else:
        print(f"nope, the answer was {pattern}")

    cv2.destroyAllWindows()

    round_counter += 1

print(f"Score: {yay_counter}/{round_counter}")
