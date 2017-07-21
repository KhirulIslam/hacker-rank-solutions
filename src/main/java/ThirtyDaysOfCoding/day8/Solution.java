package ThirtyDaysOfCoding.day8;

import java.util.Scanner;
import java.util.*;
import java.io.*;

/**
 * Created by khirul
 * on 7/21/2017.
 */
public class Solution {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int counter=0;
        Map<String,Integer> phoneBook=new HashMap<String,Integer>();
        List<String> searchKeys=new ArrayList<String>();
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            searchKeys.add(s);
        }

        for (String key:searchKeys){
            if(phoneBook.containsKey(key)){
                System.out.println(key +"="+phoneBook.get(key));
            }else{
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
