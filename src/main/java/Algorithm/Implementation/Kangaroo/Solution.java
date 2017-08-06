package Algorithm.Implementation.Kangaroo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by khirul
 * on 8/6/2017.
 */
public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        return (v1 > v2 && ((x1 - x2) % (v2 - v1)) == 0) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
