package Algorithm.Strings.MarsExploration;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int result = 0;

        int counter = S.length() / 3;
        for (int i = 0; i < counter; i++) {

            int p = i * 3;
            if (S.charAt(p) != 'S') {
                result++;
            }
            if (S.charAt(p + 1) != 'O') {
                result++;
            }
            if (S.charAt(p + 2) != 'S') {
                result++;
            }
        }

        System.out.println(result);
    }
}
