import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class interviewIO_thirdSmallestGoogle_4{
     /*QUESTION
      */
    public static void main( String[] args){
        System.out.println("kjhwguefjgh");

        int[] send = {100,2,31,4,3,7,54,33,22,1,3};
        System.out.print(sol(send));


    }
    public static int sol(int[] a){
         /* P L A N 
          -run time approx: 
        */


        /* FUTURE ITERATION
        */

        int smallest = a[0], sec = a[0], third = a[0];
        for(int e: a){
            if(e < smallest){
                third = sec;
                sec = smallest;
                smallest = e;
            }
            else if(e < sec){
                third = sec;
                sec = e;
            }
            else if(e < third)
                third = e;

        }

        return third;
        
    }
      
    
}