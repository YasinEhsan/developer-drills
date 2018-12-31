import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class dailyCode1_findSum_5{
     /*QUESTION
        This problem was recently asked by Google.

        Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

        For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

        Bonus: Can you do this in one pass?
      */
    public static void main( String[] args){
        int[] a = {10, 15, 3, 7};
        System.out.println(sol(a,17));
    }
    public static boolean sol(int[] a, int k){
         /* PLAN
            -run time approx: 
        */
        
        for(int i = 0; i < a.length -1; ++i)
            for(int j = i + 1; j < a.length; ++j)
                // System.out.printf("%d %d %d",a[i],a[j],a[i]+a[j]); //BROLIC PRINTF
                // System.out.println("\n" + a[i] + " " + a[j] + " " + (a[i] + a[j]));
                if(a[j] + a[i] == k)
                    return true;
        return false;

        /* FUTURE ITERATION
            - find sum of three numbers instead of two, find sum of n numbers
            - what is the time comlexity, what is space complexcity. cardinality? combination? 
        */
        
    }
    
}