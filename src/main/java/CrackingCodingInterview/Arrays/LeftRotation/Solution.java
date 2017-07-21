package CrackingCodingInterview.Arrays.LeftRotation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by khirul
 * on 7/21/2017.
 */
public class Solution {
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int i;
        for (i = 0; i < k; i++) {
            a = leftRotatebyOne(a, n);
        }
        return a;
    }

    public static int[] leftRotatebyOne(int[] a, int n) {
        int i, temp;
        temp = a[0];
        for (i = 0; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[i] = temp;
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for (int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();
    }
}
