package Algorithm.Strings.CamelCase;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String s = in.next();
        if (s.length() > 0) {
            count++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
