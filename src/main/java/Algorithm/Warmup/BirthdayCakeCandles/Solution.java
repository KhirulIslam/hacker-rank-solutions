package Algorithm.Warmup.BirthdayCakeCandles;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int counter = 0;

        for (int height_i = 0; height_i < n; height_i++) {
            height[height_i] = in.nextInt();
        }

        int max = height[0];

        for (int h : height) {
            if (h > max) {
                max = h;
            }
        }

        for (int h : height) {
            if (max == h) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
