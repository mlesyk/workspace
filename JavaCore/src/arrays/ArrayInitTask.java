package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Maks on 13.07.2017.
 */
public class ArrayInitTask {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array length:");
        int arraySize = 0;
        try {
            arraySize = Integer.parseInt(input.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Incorrect format: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Enter symbol/number/string to fill array:");
        String arrayData = input.readLine();
        String[] array = new String[arraySize];
        Arrays.fill(array,arrayData);
        System.out.println("Filled array: " + Arrays.asList(array));

        StringBuffer sb = new StringBuffer("qwe");
        System.out.println(sb.reverse());
    }
}
