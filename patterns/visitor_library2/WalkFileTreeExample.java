package visitor_library2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;
import java.util.Queue;

import static java.util.Collections.asLifoQueue;

public class WalkFileTreeExample {

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
        Path path = Paths.get("../../APSEI/assign1");
        
        String choice = "-r";

        if (choice == "-r")
            calculateSizeByWalkingTree(path);
        else
            calculateSizeNaively(path);

    }
 
    private static void calculateSizeNaively(Path path)
            throws IOException {
        System.out.println("Without recursive option:");
        displaySize(path, Files.size(path));
    }
 
    private static void calculateSizeByWalkingTree(Path path)
            throws IOException {
        System.out.println("\nWith recursive option:");
        FileSizeCalculator calculator
            = new FileSizeCalculator();
        Files.walkFileTree(path, calculator);
    }
 
    private static void displaySize(Path dir, long size) {
        System.out.printf("%s: %d KB%n",
                dir, (size / 1024));
    }
}