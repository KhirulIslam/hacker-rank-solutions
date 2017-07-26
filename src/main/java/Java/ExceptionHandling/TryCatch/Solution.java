package Java.ExceptionHandling.TryCatch;

import java.io.*;
import java.util.*;
/**
 * Created by khirul
 * on 7/26/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Integer x = scanner.nextInt();
            Integer y = scanner.nextInt();
            if (y == 0) {
                throw new ArithmeticException("/ by zero");
            }
            System.out.println(x / y);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e instanceof ArithmeticException ? e : e.getClass().getName());
        }
    }
}
