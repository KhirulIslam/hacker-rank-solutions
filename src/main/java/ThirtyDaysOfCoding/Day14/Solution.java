package ThirtyDaysOfCoding.Day14;

import java.util.Scanner;

/**
 * Created by khirul
 * on 7/23/2017.
 */
class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elmnts) {
        this.elements = elmnts;
    }

    public void computeDifference() {
        int difference = 0;
        for (int element1 : elements) {
            for (int element2 : elements) {
                difference = Math.abs(element1 - element2);
                this.maximumDifference = difference > maximumDifference ? difference : maximumDifference;
            }
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
