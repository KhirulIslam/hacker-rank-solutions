package Java.BigInteger.JavaBigInteger;

import java.io.*;
import java.util.*;
import  java.math.BigInteger;
/**
 * Created by khirul
 * on 7/25/2017.
 */
public class Solution {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String a= scanner.nextLine();
    String b= scanner.nextLine();

    BigInteger val_a = new BigInteger(a);
    BigInteger val_b = new BigInteger(b);

    System.out.println(val_a.add(val_b));
    System.out.println(val_a.multiply(val_b));
}
}
