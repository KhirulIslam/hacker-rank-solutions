package Algorithm.Warmup.MiniMaxSum;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long total = 0;
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long max = a + b + c + d;
        long min = a + b + c + d;

        for (int i = 0; i < 5; i++) {
            total = a + b + c + d + e;

            switch (i) {
                case 0:
                    total = total - a;
                    break;
                case 1:
                    total = total - b;
                    break;
                case 2:
                    total = total - c;
                    break;
                case 3:
                    total = total - d;
                    break;
                case 4:
                    total = total - e;
                    break;
            }

            if (total > max) {
                max = total;
            } else if (total < min) {
                min = total;
            }
        }

        System.out.println(min + " " + max);
    }
}
