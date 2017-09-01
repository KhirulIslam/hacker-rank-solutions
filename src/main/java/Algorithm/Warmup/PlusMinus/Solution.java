package Algorithm.Warmup.PlusMinus;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double positives = 0;
        double negatives = 0;
        double zeros = 0;

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (value == 0) {
                zeros++;
            } else if (value > 0) {
                positives++;
            } else {
                negatives++;
            }
        }
        System.out.println(positives / n);
        System.out.println(negatives / n);
        System.out.println(zeros / n);
    }
}
