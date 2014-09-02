package fibonacci;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fibonacci {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> result = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (result.size() < 10) {
            int input = Integer.parseInt(reader.readLine());
            if (isFibonacci(input)) {
                System.out.println("true, the " + input + " is Fibonacci");
                result.add(input);
            } else {
                System.out.println("false, the " + input + " is not Fibonacci");
            }
        }
    }

    public static boolean isFibonacci(int input) {
        double fibonacciCheck1 = 5 * input * input + 4;
        double fibonacciCheck2 = 5 * input * input - 4;
        double check1 = Math.sqrt(fibonacciCheck1);
        double check2 = Math.sqrt(fibonacciCheck2);
        return check1 == Math.round(check1) || check2 == Math.round(check2);  // проверяем является ли корень квадратный целым числом
    }

}
