package Algorithm.Implementation.DivisibleSumPairs;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key, i, data, j;
        int counter = 0;
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        for (i = 0; i < n; i++) {
            key = a[i];
            for (j = i + 1; j < n; j++) {
                data = a[j];
                if ((key + data) % k == 0) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
