/* 
Yasin Ehsan
Coding Workouts 
2.20.19
*/

import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class classified_adjacentChar_3{
     /*QUESTION
     
      */
    public static void main( String[] args){
        System.out.println("kjhwguefjgh");
        charTesting();
    }
    public static List<Integer> sol(List<String> words){
         /* P L A N 
          -run time approx: 
          - while
        */

        /* FUTURE ITERATION
        */
        List<Integer> dora = new ArrayList<>();
        return dora;
    }
    private static void charTesting(){
    //    System.out.println("C".equals("c"));

        String s = "jjfk";
        for(int i = 0; i < s.length() -1; ++i){
            int j = i +1;
            System.out.printf("\ni:%s", s.substring(i,i+1));
            System.out.printf("\nj:%s\n", s.substring(j,j+1));

            
            System.out.println(i == j);
            
        }

        // char[] c = s.toCharArray();
        // System.out.printf("%C",c[2]);
        // char c1 = 'c';
        // char c2 = 'C';
        // if(c1 != c2)
        //     System.out.println("==");
        // if(c1 != 23)
        //     System.out.print("numero");

        // c1 = 47;
        // System.out.print(c1);
    }
    
    
}