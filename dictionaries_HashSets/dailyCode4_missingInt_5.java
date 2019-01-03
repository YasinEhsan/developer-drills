import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class dailyCode4_missingInt_5{
     /*QUESTION
        This problem was asked by Stripe.

        Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

        For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

        You can modify the input array in-place.
      */
    public static void main( String[] args){
        int[] a = {3, 4, -1, 1};
        int[] b = {1, 2, 0};
        System.out.println(sol(b));
       
    }
    public static int sol(int[] a){
         /* P L A N 
          -find max;
          -store contents in hashset
          -return any # less than max or the # after max
        */

        Set<Integer> store = new HashSet<Integer>();
        int max = 0, next = 0;

        for(int e: a){
            if(max < e)
                max = e;
            store.add(e);
        }
            
        for(int i = 1; i < max; ++i){
            if(!store.contains(i))
                return i;
        }

        return ++max;


        /* FUTURE ITERATION
        */
        
    }
    
}