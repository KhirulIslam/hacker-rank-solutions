package Algorithm.Implementation.AppleAndOrange;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int counter_a = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            int distance =a+in.nextInt();
            if(distance>=s&&distance<=t){
                counter_a++;
            }
        }

        int counter_o=0;
        for(int orange_i=0; orange_i < n; orange_i++){

            int distance =b+in.nextInt();
            if(distance>=s&&distance<=t){
                counter_o++;
            }
        }

        System.out.println(counter_a);
        System.out.println(counter_o);
    }
}
