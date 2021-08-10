import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // basic text reader
        TextReaderInterface textReader = new TextReader("files/alimentos.txt");
        System.out.println("hasNext() " + textReader.hasNext());
        System.out.println("next() " + textReader.next());
        System.out.println("next() " + textReader.next());
        System.out.println("next() " + textReader.next());
        System.out.println("next() " + textReader.next());
        System.out.println();

        // term filter
        TextReaderInterface termFilter = new TermFilter(new TextReader("files/alimentos.txt"));
        System.out.println("hasNext() " + termFilter.hasNext());
        System.out.println("next() " + termFilter.next());
        System.out.println();

        // normalization filter
        TextReaderInterface normalizationFilter = new NormalizationFilter(new TextReader("files/alimentos.txt"));
        System.out.println("hasNext() " + normalizationFilter.hasNext());
        System.out.println("next() " + normalizationFilter.next());
        System.out.println();

        // vowel filter
        TextReaderInterface vowelFilter = new VowelFilter(new TextReader("files/alimentos.txt"));
        System.out.println("hasNext() " + vowelFilter.hasNext());
        System.out.println("next() " + vowelFilter.next());
        System.out.println();

        // capitalization filter
        TextReaderInterface capitalizationFilter = new CapitalizationFilter(new TextReader("files/alimentos.txt"));
        System.out.println("hasNext() " + capitalizationFilter.hasNext());
        System.out.println("next() " + capitalizationFilter.next());
        System.out.println();

    }
}