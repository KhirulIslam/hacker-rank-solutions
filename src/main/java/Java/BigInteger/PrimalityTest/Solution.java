package Java.BigInteger.PrimalityTest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by khirul
 * on 7/25/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        // Write your code here.
        System.out.println(n.isProbablePrime(1)?"prime":"not prime");
    }
}
