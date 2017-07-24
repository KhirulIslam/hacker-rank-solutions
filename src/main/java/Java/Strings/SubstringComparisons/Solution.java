package Java.Strings.SubstringComparisons;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by khiru
 * on 7/24/2017.
 */
public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String sub="";
        SortedSet<String> tokens = new TreeSet<String>();

        for(int i=0;i<=s.length()-k;i++){
            sub= s.substring(i,i+k);
            tokens.add(sub);
        }

        return tokens.first()+"\n"+tokens.last();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
