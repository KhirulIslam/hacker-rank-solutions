package Java.Strings.JavaAnagrams;

import java.io.*;
import java.util.*;

/**
 * Created by khirul
 * on 7/23/2017.
 */
public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a= a.toUpperCase();
        b=b.toUpperCase();
        char[] a_chars = a.toCharArray();
        char[] b_chars = b.toCharArray();

        Arrays.sort(a_chars);
        Arrays.sort(b_chars);

        return Arrays.equals(a_chars,b_chars);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
