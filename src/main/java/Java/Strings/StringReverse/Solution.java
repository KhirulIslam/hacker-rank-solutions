package Java.Strings.StringReverse;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder builder = new StringBuilder(A);
        String B = builder.reverse().toString();
        System.out.println(A.equals(B) ? "Yes" : "No");
    }
}
