package Java.Introduction.JavaCurrencyFormatter;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usFormatter = NumberFormat.getCurrencyInstance();
        String us = usFormatter.format(payment);
        Locale indiaLocal = new Locale("en", "IN");
        NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(indiaLocal);
        String india = indiaFormatter.format(payment);
        NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormatter.format(payment);
        NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormatter.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
