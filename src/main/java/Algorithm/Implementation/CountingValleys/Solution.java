package Algorithm.Implementation.CountingValleys;

import java.io.*;
import java.util.*;

/**
 * Created by khirul
 * on 8/3/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String map = scanner.next();
        int level = 0;
        int vCount = 0;
        boolean downFlag = false;

        for (int i = 0; i < map.length(); i++) {
            char c = map.charAt(i);
            if (c == 'U') {
                level++;
            } else {
                level--;
            }

            if (level < 0) {
                downFlag = true;
            }

            if (level >= 0 && downFlag) {
                vCount++;
                downFlag = false;
            }
        }

        System.out.println(vCount);
    }
}
