package Java.Introduction.JavaDateAndTime;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;

        while (scanner.hasNext()) {
            System.out.printf("%d %s", counter, scanner.nextLine());
            System.out.println();
            counter++;
        }
    }
}
