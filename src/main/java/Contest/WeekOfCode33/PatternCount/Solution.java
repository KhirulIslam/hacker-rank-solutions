package Contest.WeekOfCode33.PatternCount;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    static int patternCount(String s){
        String pattern="(?<=1)[0]+(?=1)";
        int count = 0;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        while (m.find()){
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = patternCount(s);
            System.out.println(result);
        }
    }
}
