package Algorithm.Implementation.GradingStudents;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by khirul
 * on 8/6/2017.
 */
public class Solution {

    static int[] solve(int[] grades) {
        int size = grades.length;

        for (int i = 0; i < size; i++) {
            int val = 5 - (grades[i] % 5);
            if (grades[i] < 38) {
                grades[i] = grades[i];
            } else if (val < 3) {
                grades[i] = grades[i] + val;
            } else {
                grades[i] = grades[i];
            }
        }

        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
