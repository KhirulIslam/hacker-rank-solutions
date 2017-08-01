package Algorithm.Implementation.SockMerchant;

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
    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (maps.containsKey(ar[i])) {
                int val = maps.get(ar[i]);
                val++;
                maps.put(ar[i], val);
            } else {
                maps.put(ar[i], 1);
            }
        }

        for (Integer key : maps.keySet()) {
            count += (int) maps.get(key) / 2;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
