package io;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

/**
 * Created by Maks on 09.08.2017.
 */
public class PathsFilesTest {
    public static void main(String[] args) throws IOException
    {
        Path dir = Paths.get(args.length == 0 ? System.getProperty("user.home") : args[0]);
        Arrays.asList(dir.toFile().listFiles()).forEach(System.out::println);
        Files.walkFileTree(dir, new SimpleFileVisitor<Path>()
        {
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
            {
                if (attrs.isDirectory())
                    System.out.println(file.getFileName() + "\t" + file.toFile().length());
                return FileVisitResult.CONTINUE;
            }
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException
            {
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
