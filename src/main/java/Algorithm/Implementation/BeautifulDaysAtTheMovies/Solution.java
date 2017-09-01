package Algorithm.Implementation.BeautifulDaysAtTheMovies;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        int j=scan.nextInt();
        int k=scan.nextInt();
        int counter=0;
        StringBuilder builder=null;

        for(int dayCounter=i;dayCounter<=j;dayCounter++){
            builder=new StringBuilder();
            builder.append(Integer.toString(dayCounter));
            int reversed=Integer.parseInt(builder.reverse().toString());
            int difference=Math.abs(dayCounter-reversed);
            if((difference%k)==0){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
