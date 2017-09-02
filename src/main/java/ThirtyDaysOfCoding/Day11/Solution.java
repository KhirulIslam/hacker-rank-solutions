package ThirtyDaysOfCoding.Day11;

import java.util.Scanner;

/**
 * Created by khirul
 * on 7/21/2017.
 */
public class Solution {

    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int temp=Integer.MIN_VALUE;

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                temp=arr[i][j]+arr[i][j+1]+arr[i][j+2]
                        +
                        arr[i+1][j+1]
                        +
                        arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                max=max>temp ? max:temp;
            }
        }
        System.out.println(max);
    }
}
