package Algorithm.Implementation.JumpingOnTheClouds;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int steps = -1;
        for (int i = 0; i < n; i++, steps++) {
            if (i<n-2 && c[i+2]==0) i++;
        }
        System.out.println(steps);
    }
}
