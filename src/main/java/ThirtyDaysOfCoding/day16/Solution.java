package ThirtyDaysOfCoding.day16;

import java.util.Scanner;

/**
 * Created by khirul
 * on 7/23/2017.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            System.out.println(Integer.parseInt(S));
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
