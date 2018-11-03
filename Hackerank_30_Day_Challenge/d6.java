import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System. in);
        int t = scanner. nextInt();

        for(int j = 0; j < t; j++){
            String word = Scanner.next;
            String even; String odd;

            for(int i =0; i < word.length(); i++){
                if(i % 2 == 0)
                    even += word[i];
                else
                    odd += word[i];

            }
            System.out.println(even + " " + odd);
        }

    }
}
