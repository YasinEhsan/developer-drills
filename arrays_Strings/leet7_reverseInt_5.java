import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class leet7_reverseInt_5{
     /*QUESTION
     Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


      */
    public static void main( String[] args){
        System.out.println(sol(-10230));
    }
    public static int sol(int x){
         /* P L A N 
          -convert string to char array 
          - edge cases if num is negative then. store the negative.
          - also chcl overflow case. where the reverse is less than 231 − 1
          - append to a string
        */

        try{
            String[] c = String.valueOf(x).split("");
            String s = "";
            if(x < 0)
                s += "-";

            for(int i = c.length -1; i>= 0;  --i)
                s += !c[i].equals("-") ? c[i] : "";

            return Integer.valueOf(s);
        }
        catch(Exception e){
            return 0;
        }

        


        /* FUTURE ITERATION
        - is there a way of doing this in less then O(n).
        - can we use recursion?
        */
        
    }
    
}