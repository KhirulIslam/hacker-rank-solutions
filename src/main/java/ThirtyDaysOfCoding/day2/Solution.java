package ThirtyDaysOfCoding.day2;

import java.util.Scanner;

/**
 * Created by khirul
 * on 7/21/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tip,tax =0D;
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        tip = (mealCost*tipPercent/100);
        tax = (mealCost*taxPercent/100);
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost+ tip + tax);

        // Print your result
        System.out.println("The total meal cost is "+totalCost +" dollars.");
    }
}
