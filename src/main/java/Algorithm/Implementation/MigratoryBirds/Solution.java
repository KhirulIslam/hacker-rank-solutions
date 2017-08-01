package Algorithm.Implementation.MigratoryBirds;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by khirul
 * on 8/1/2017.
 */
public class Solution {
    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        Map<Integer, Integer> birdsByType = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (birdsByType.containsKey(ar[i])) {
                Integer val = birdsByType.get(ar[i]);
                val++;
                birdsByType.put(ar[i], val);
            } else {
                birdsByType.put(ar[i], 1);
            }
        }
        Integer max = birdsByType.keySet().iterator().next();
        for (Integer key : birdsByType.keySet()) {
            if (birdsByType.get(key) > birdsByType.get(max)) {
                max = key;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
