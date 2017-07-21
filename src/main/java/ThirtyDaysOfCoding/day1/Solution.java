package ThirtyDaysOfCoding.day1;

import java.util.Scanner;

/**
 * Created by khirul
 * on 7/21/2017.
 */
public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int i_2 = 0;
        double d_2 = 0.0D;
        String s_2 = new String();

        i_2 = scan.nextInt();
        d_2 = scan.nextDouble();
        scan.nextLine();
        s_2 = scan.nextLine();

        System.out.println(i + i_2);
        System.out.println(d + d_2);

        System.out.println(s + s_2);
        scan.close();
    }
}
