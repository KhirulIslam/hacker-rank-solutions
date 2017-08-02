package Algorithm.Implementation.DesignerPDFViewer;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by khirul
 * on 8/2/2017.
 */
public class Solution {
    private static int getCharIndex(char c) {
        return (int) c - 97;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for (int h_i = 0; h_i < 26; h_i++) {
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int maxHeight = h[getCharIndex(word.charAt(0))];
        int length = word.length();

        for (int i = 0; i < length; i++) {
            char c = word.charAt(i);
            int pos = getCharIndex(c);
            if (h[pos] > maxHeight) {
                maxHeight = h[pos];
            }
        }
        System.out.println(maxHeight * 1 * length);
    }
}
