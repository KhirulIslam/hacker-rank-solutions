package Algorithm.Implementation.ViralAdvertising;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int totalNumberOfPeople=5;
        int totalLikes=0;
        int totalNumberOfDays=0;
        int likes=0;
        Scanner scanner = new Scanner(System.in);
        totalNumberOfDays=scanner.nextInt();

        for(int i=1;i<=totalNumberOfDays;i++){
            likes=totalNumberOfPeople/2;
            totalNumberOfPeople=likes*3;
            totalLikes+=likes;
        }

        System.out.println(totalLikes);
    }
}
