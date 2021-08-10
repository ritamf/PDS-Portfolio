package visitor_library3;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.FileVisitor;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.FileVisitResult;
import java.nio.file.FileSystems;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;

public class RecursiveFileVisitor {
    public static void main(String args[]) {

        FileVisitor<Path> simpleFileVisitor = new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println("-------------------------------------");
                System.out.println("DIRECTORY NAME:" + dir.getFileName() + " LOCATION:" + dir.toFile().getPath());
                System.out.println("-------------------------------------");
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path visitedFile, BasicFileAttributes fileAttributes) throws IOException {
                System.out.println("FILE NAME: " + visitedFile.getFileName());
                return FileVisitResult.CONTINUE;
            }
        };
        FileSystem fileSystem = FileSystems.getDefault();
        Path rootPath = fileSystem.getPath("../../APSEI");
        try {
            Files.walkFileTree(rootPath, simpleFileVisitor);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}