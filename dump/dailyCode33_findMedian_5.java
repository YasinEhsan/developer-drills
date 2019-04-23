import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class dailyCode33_findMedian_5{
     /*QUESTION
     This problem was asked by Microsoft.

    Compute the running median of a sequence of numbers. 
    That is, given a stream of numbers, print out the median of the list so far on each new element.
    Recall that the median of an even-numbered list is the average of the two middle numbers.        
    For example, given the sequence [2, 1, 5, 7, 2, 0, 5], your algorithm should print out:
    2
    1.5
    2
    3.5
    2
    2
    2

      */
    public static void main( String[] args){
        int [] stream = {2, 1, 5, 7, 2, 0, 5};

        sol(stream);
    }
    public static void sol(int[] a){
         /* PLAN
        - goal is to sort the list in inc order. loop thru each element. and swap elements when needed
        - that could be an insrtion sort func. OR use arrays.sort 
        - if num is odd then print the middle number. arr[pos/2] bc zero indexed
        - else print the av of the two middle nums. (arr[pos/2] + arr[pos/2 + 1]) / 2
        */

        int pos = 0;
        while(pos < a.length){
            
            int[] temp = new int[pos];
            for(int i = 0; i < pos; ++i)
                temp[i] = a[i];
             Arrays.sort(temp);
            if(pos == 0)
                System.out.println(a[0]);
            else if(pos%2 == 1)
                System.out.println(temp[pos/2]);
            else
                System.out.println((double)(temp[pos/2] + temp[pos/2 + 1])/2);
            pos++;
        }

            
        
    }
    
}