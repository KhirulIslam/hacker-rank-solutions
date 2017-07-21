package ThirtyDaysOfCoding.day10;

import java.util.Scanner;

/**
 * Created by khirul
 * on 7/21/2017.
 */
public class Solution {

    private static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}
