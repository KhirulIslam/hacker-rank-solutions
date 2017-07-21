package ThirtyDaysOfCoding.day3;

import java.util.Scanner;

/**
 * Created by khirul
 * on 7/21/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }else if(n%2==0 && (2 <=n && n <=5)){
            ans = "Not Weird";
        }else if(n%2==0 && (6 <=n && n<= 20)){
            ans = "Weird";
        }
        else if(n%2==0 && (n>20)){
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
