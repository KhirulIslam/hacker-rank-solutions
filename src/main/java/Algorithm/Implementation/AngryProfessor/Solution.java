package Algorithm.Implementation.AngryProfessor;

import java.util.*;

/**
 * Created by khirul
 * on 8/2/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] result = new String[t];

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int counter = 0;
            for (int j = 0; j < n; j++) {
                int v = scanner.nextInt();
                if (v <= 0) counter++;
            }
            if (counter >= k) {
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }

    }
}
