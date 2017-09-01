package Algorithm.Implementation.EqualizeTheArray;

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int counter = 0;
        int n = scanner.nextInt();
        int data[] = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }
        for (int key : data) {
            counter = 0;
            for (int d : data) {
                if (key == d) {
                    counter++;
                }
            }
            if (counter > result) {
                result = counter;
            }
        }

        System.out.println(n - result);
    }
}
