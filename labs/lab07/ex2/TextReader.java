import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class TextReader implements TextReaderInterface {

    Scanner sc;

    public TextReader(String fileName) {
        try {
            File fileObj = new File(fileName);
            this.sc = new Scanner(fileObj);
            System.out.println("Simple Text Reader has been added.");

        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
    }

    public boolean hasNext() {
        return sc.hasNext();
    }

    // returns a paragraph
    public String next() {
        try {
            return sc.nextLine();

        } catch (NoSuchElementException e) {
            return "The file doesn't have more paragraphs to print!";
        }
    }
}
