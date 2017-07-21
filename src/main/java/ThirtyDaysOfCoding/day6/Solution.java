package ThirtyDaysOfCoding.day6;

import java.util.Scanner;

/**
 * Created by khirul
 * on 7/21/2017.
 */
public class Solution {
    public static void print(String []inputs){
        char charArray[];
        StringBuilder oddString;
        StringBuilder evenString;
        int length;

        for (String input : inputs){
            length=input.length();
            charArray=new char[length];
            charArray=input.toCharArray();
            evenString= new StringBuilder();
            oddString=new StringBuilder();

            for(int i=0;i<length;i++){
                if(i%2==0){
                    evenString.append(charArray[i]);
                }  else{
                    oddString.append(charArray[i]);
                }
            }
            System.out.println(evenString +" "+oddString);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t,i;
        String []inputs;
        Scanner scanner=new Scanner(System.in);
        t=scanner.nextInt();
        inputs=new String[t];
        for(i=0;i<t;i++){
            inputs[i]=scanner.next();
        }
        print(inputs);
    }
}
