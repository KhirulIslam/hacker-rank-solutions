package ThirtyDaysOfCoding.Day20;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int swap = 0, temp;
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n - 1; a_j++) {
                if (a[a_j] > a[a_j + 1]) {
                    swap++;
                    temp = a[a_j];
                    a[a_j] = a[a_j + 1];
                    a[a_j + 1] = temp;
                }
            }
        }

        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }
}
