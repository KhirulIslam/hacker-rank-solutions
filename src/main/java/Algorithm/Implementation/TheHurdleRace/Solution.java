package Algorithm.Implementation.TheHurdleRace;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int bvgCounter = 0;
        int diff = 0;
        int[] height = new int[n];
        for (int height_i = 0; height_i < n; height_i++) {
            height[height_i] = in.nextInt();
        }

        for (int h : height) {
            diff = h - k;
            if (diff > 0 && diff > bvgCounter) {
                bvgCounter = diff;
            }
        }

        System.out.println(bvgCounter);
    }
}
