package fibonacci;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FibonacciAlgo {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> result = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your numbers");
        while (result.size() < 10) {
            int input = Integer.parseInt(reader.readLine());
            if (isFibonacci(input)) {
                System.out.println("true, the " + input + " is Fibonacci");
                result.add(input);
            } else {
                System.out.println("false, the " + input + " is not Fibonacci");
            }
        }
        System.out.print("Congratulation! Your 10 fibonacci numbers are: ");
        for (int i : result) {
            System.out.print(" " + i);
        }
    }

    public static boolean isFibonacci(int input) {
        int first = 0;
        int second = 1;
        while (input >= first) {
            if (input != first) {
                second = first + second;
                first = second - first;
            } else {
                return true;
            }
        }
        return false;

    }
}
