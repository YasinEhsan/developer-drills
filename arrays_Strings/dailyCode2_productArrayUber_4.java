import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class dailyCode2_productArrayUber_4{
     /*QUESTION
        This problem was asked by Uber.

        Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

        For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

        Follow-up: what if you can't use division?
      */
    public static void main( String[] args){
        int[] a = {3,2,1};
        int[] ans = sol(a);
        
        for(int e: ans)
            System.out.print(e + "\t");
        
    }
    public static int[] sol(int[] a){
         /* P L A N 
          -run time approx: v1 o(n), v2
          - multiply all the numbers in the array for each pos expexct curr.
          - double for loop wiht condition if index then continue. o(nsq) 
          - th above should care fro zero edge case rather than v1
        */

        //v1: doesnt accout for zero as an input
        int[] prodarr1 = new int[a.length];
        int prod = 1; 

        for(int e: a)
            prod *= e;

        for(int i = 0; i < a.length; ++i)
            prodarr1[i] = prod/a[i];

        //v2: doesnt use division. also accounts for zero as input. runtime o(n^2)
        int[] prodarr = new int[a.length];
        for(int i = 0; i < a.length; ++i){
            prodarr[i] = 1;
            for(int j = 0; j < a.length; ++j){
                if(j == i)
                    continue;
                else
                    prodarr[i] *= a[j];
            }
        }
        


        return prodarr;
        /* FUTURE ITERATION
        */
        
    }
    
}