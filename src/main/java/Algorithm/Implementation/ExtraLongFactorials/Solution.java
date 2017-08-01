package Algorithm.Implementation.ExtraLongFactorials;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by khirul
 * on 8/1/2017.
 */
public class Solution {
    private static BigInteger factorial(Integer n) {
        if (n == 0) {
            return new BigInteger("1");
        } else {
            return (new BigInteger(n.toString())).multiply(factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}
