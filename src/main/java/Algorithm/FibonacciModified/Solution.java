package Algorithm.FibonacciModified;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BigInteger t1 = new BigInteger(scanner.next());
        BigInteger t2 = new BigInteger(scanner.next());
        int n = scanner.nextInt();
        BigInteger result = new BigInteger("1");

        for (int i = 2; i < n; i++) {

            result = t2.multiply(t2);
            result = result.add(t1);
            t1 = t2;
            t2 = result;
        }

        System.out.print(result);
    }
}
