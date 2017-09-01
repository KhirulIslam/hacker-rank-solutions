package Algorithm.Implementation.CatsAndMouse;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            calculate(x,y,z);
        }
    }

    public static void calculate(int x, int y, int z){
        int dCatA=Math.abs(x-z);
        int dCatB=Math.abs(y-z);

        if(dCatA<dCatB){
            System.out.println("Cat A");
        }else if(dCatB<dCatA){
            System.out.println("Cat B");
        }else{
            System.out.println("Mouse C");
        }
    }
}
