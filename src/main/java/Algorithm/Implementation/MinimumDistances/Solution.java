package Algorithm.Implementation.MinimumDistances;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Integer> temp = new TreeSet<Integer>();
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }

        for(int A_i=0; A_i < n; A_i++){
            for(int A_j=0; A_j < n; A_j++){
                if(A[A_i]==A[A_j] && A_i!=A_j){
                    Integer diff=Math.abs(A_i-A_j);
                    temp.add(diff);
                }
            }
        }

        int result = temp.size() == 0 ? -1 : temp.first();
        System.out.println(result);
    }
}
