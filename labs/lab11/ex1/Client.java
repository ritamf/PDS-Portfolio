package ex1;

import java.util.Scanner;

public class Client {
	
	private static int numPhones;
	private static Phone[] phones;
	
	private static Magazine bub;
	private static Magazine quick;
	private static Magazine insertion;
	private static Magazine chosenAlgo;

	private static Scanner scAlgorithm;
	private static Scanner scAttribute;

	private static String algorithm;
	private static String attribute;
	
    public static void main(String args[]) {
    	
    	defineArrayOfPhones();
    	defineSortingAlgorithms();
    	
		while (true) {
    		chooseAlgoAndAttrToBeSorted();
			sort();
		}

    }
    
    private static void defineArrayOfPhones() {
    	numPhones = 3;
    	
    	phones = new Phone[numPhones];
    	
    	for (int i = 0; i < numPhones; i++)
    		phones[i] = new Phone("Exynos"+i, 300.99 + i*10, 128, "EnVizion 360 v"+i);
    }
    
    private static void defineSortingAlgorithms() {
    	bub = new Magazine(new BubbleSort());
    	quick = new Magazine(new QuickSort());
    	insertion = new Magazine(new InsertionSort());
    }

	private static void chooseAlgoAndAttrToBeSorted() {
		System.out.println("\nChoose algorithm:\n(b) Bubble\n(i) Insertion\n(q) Quick");
		scAlgorithm = new Scanner(System.in);
		algorithm = scAlgorithm.nextLine();

		System.out.println("\nChoose attribute to be sorted:\n(1) Processor\n(2) Price\n(3) Memory\n(4) Camera");
		scAttribute = new Scanner(System.in);
		attribute = scAttribute.nextLine();
	}
    
    private static void sort() {
		switch(algorithm) {
			case "b":
				chosenAlgo = bub; 
				sortByAttr();
				break;
			case "q":
				chosenAlgo = quick;
				sortByAttr();
				break;
			case "i":
				chosenAlgo = insertion;
				sortByAttr();
				break;
			default:
				System.out.println("Invalid algorithm choice");
		}
    }

	private static void sortByAttr() {
		switch(attribute) {
			case "1":
				chosenAlgo.sortByProcessor(phones);
				break;
			case "2":
				chosenAlgo.sortByPrice(phones);
				break;
			case "3":
				chosenAlgo.sortByMemory(phones);
				break;
			case "4":
				chosenAlgo.sortByCamera(phones);
				break;
			default:
				System.out.println("Invalid attribute choice");
		}
	}
}
