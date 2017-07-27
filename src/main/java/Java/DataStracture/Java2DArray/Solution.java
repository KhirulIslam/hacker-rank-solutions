package Java.DataStracture.Java2DArray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by khirul
 * on 7/27/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer max = Integer.MIN_VALUE;
        int a[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                a[i][j] = in.nextInt();
            }
        }

        for(int i=0; i <4; i++){
            for(int j=0; j <4; j++){
                Integer total = a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                max=total>max? total : max;
            }
        }

        System.out.println(max);
    }
}
