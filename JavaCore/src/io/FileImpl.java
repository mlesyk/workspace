package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Created by Maks on 19.07.2017.
 */
public class FileImpl {
    public static void main(String[] args) {
        File directory = new File("C:\\data");
        File subDirectory = new File(directory, "\\subdir1\\subdir2");
        if (directory.exists()) {
            directory.delete();
        }
        directory.mkdir();
        subDirectory.mkdirs();
        System.out.println(directory.getAbsolutePath() + File.separator + directory.list()[0]);
        File textFile1 = new File(directory, "textFile1.txt");
        File textFile2 = new File(directory.getAbsolutePath()+ File.separator + directory.list()[0],"textFile2.txt" );
        File textFile3 = new File(subDirectory, "textFile3.txt");
        try {
            textFile1.createNewFile();
            textFile2.createNewFile();
            textFile3.createNewFile();
        } catch(IOException e) {
            e.printStackTrace();
        }

        Path path = Paths.get(".");
        System.out.println("Path = " + path.toAbsolutePath());

//        System.out.println(System.getProperty("user.dir"));
    }
}
