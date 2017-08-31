package Java.BigNumber.JavaBigInteger;
import java.io.*;
import java.util.*;
import  java.math.BigInteger;

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
