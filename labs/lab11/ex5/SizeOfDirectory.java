package ex5;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;
import java.util.Queue;

import static java.util.Collections.asLifoQueue;

public class SizeOfDirectory {

    public static class FileSizeCalculator extends SimpleFileVisitor<Path> {

        private Queue<Long> sizesOfParents = asLifoQueue(new LinkedList<>());
        private long currentDirSize;

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            sizesOfParents.add(currentDirSize);
            currentDirSize = 0;
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(
                Path file, BasicFileAttributes attrs)
                throws IOException {
            currentDirSize += attrs.size();
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(
                Path dir, IOException e) throws IOException {
            displaySize(dir, currentDirSize);
            currentDirSize += sizesOfParents.remove();
            return FileVisitResult.CONTINUE;
        }
    }

    public static void main(String[] args) throws IOException {
        
    	String choice = args[0];
    	String pathStr = args[1];
    	
        Path path = Paths.get(pathStr);
        System.out.println(choice);
        if (choice.equals("-r") )
        	calculateSizeWithSubdirectoriesSize(path);
        else
            calculateSizeWithoutSubdirectoriesSize(path);

    }
 
    private static void calculateSizeWithoutSubdirectoriesSize(Path path) throws IOException {
        System.out.println("\nWithout subdirectories size:");
        displaySize(path, Files.size(path));
    }
 
    private static void calculateSizeWithSubdirectoriesSize(Path path) throws IOException {
        System.out.println("\nWith subdirectories size:");
        FileSizeCalculator calculator
            = new FileSizeCalculator();
        Files.walkFileTree(path, calculator);
    }
 
    private static void displaySize(Path dir, long size) {
        System.out.printf("%s: %d KB%n",
                dir, (size / 1024));
    }
}