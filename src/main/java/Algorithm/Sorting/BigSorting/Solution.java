package Algorithm.Sorting.BigSorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> unsorted = new ArrayList<String>();
        for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
            unsorted.add(in.next());
        }
        Collections.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }

                for (int i = 0; i < o1.length(); i++) {
                    char c1 = o1.charAt(i);
                    char c2 = o2.charAt(i);

                    if (c1 != c2) {
                        return c1 - c2;
                    }
                }
                return 0;
            }
        });
        unsorted.forEach(System.out::println);

    }
}
