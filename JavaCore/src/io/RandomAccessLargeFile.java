package io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Maks on 09.08.2017.
 */
public class RandomAccessLargeFile {
    public static void main(String[] args) throws Exception {
        Path filename = Paths.get("C:\\data.txt");
        try (RandomAccessFile file = new RandomAccessFile(filename.toFile(), "rwd"))
        {
            long length = file.length();
            int lineLength = "qwerty".getBytes().length;
            for (long p = 0; p < length;)
            {
                file.seek(p);
                String s = file.readLine();
                lineLength = s.length();
                s = s + "123";

            }
        }
    }
}
