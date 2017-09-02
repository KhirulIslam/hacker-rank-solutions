package ThirtyDaysOfCoding.Day5;

import java.util.Scanner;

/**
 * Created by khirul
 * on 7/21/2017.
 */
public class Solution {
    private static void print(int n){
        for(int i=1;i<=10;i++){
            System.out.println( n+ " x "+i+" = "+ i*n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n);
    }
}
