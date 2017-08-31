package Algorithm.Warmup.TimeConversion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        StringBuilder result = new StringBuilder();

        if (time.endsWith("PM")) {
            String hourString = time.substring(0, time.indexOf(":"));
            int hour = hourString.equals("12") ? Integer.parseInt(hourString) : Integer.parseInt(hourString) + 12;
            result.append(hour);
            result.append(time.substring(time.indexOf(":"), time.indexOf("PM")));

        } else {
            String hourString = time.substring(0, time.indexOf(":"));
            hourString = hourString.equals("12") ? "00" : hourString;
            result.append(hourString);
            int x = time.indexOf(":");
            int y = time.indexOf("AM");
            result.append(time.substring(x, y));
        }

        System.out.println(result);
    }
}
