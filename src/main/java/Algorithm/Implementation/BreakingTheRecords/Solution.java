package Algorithm.Implementation.BreakingTheRecords;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H_COUNTER = 0;
        int L_COUNTER = 0;
        int H_SCORE = 0;
        int L_SCORE = 0;
        int n = in.nextInt();
        int[] score = new int[n];

        for (int score_i = 0; score_i < n; score_i++) {
            score[score_i] = in.nextInt();
            if (score_i == 0) {
                H_SCORE = score[0];
                L_SCORE = score[0];
            }

            int data = score[score_i];
            for (int score_k = 0; score_k < score_i; score_k++) {
                if (data > H_SCORE) {
                    H_COUNTER++;
                    H_SCORE = data;
                }
                if (data < L_SCORE) {
                    L_COUNTER++;
                    L_SCORE = data;
                }
            }
        }

        System.out.println(H_COUNTER + " " + L_COUNTER);
    }
}
