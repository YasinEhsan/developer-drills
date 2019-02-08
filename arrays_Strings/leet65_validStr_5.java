import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class leet65_validStr_3{
     /*QUESTION
        Validate if a given string can be interpreted as a decimal number.

        Some examples:
        "0" => true
        " 0.1 " => true
        "abc" => false
        "1 a" => false
        "2e10" => true
        " -90e3   " => true
        " 1e" => false
        "e3" => false
        " 6e-1" => true
        " 99e2.5 " => false
        "53.5e93" => true
        " --6 " => false
        "-+3" => false
        "95a54e53" => false

        Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one. However, here is a list of characters that can be in a valid decimal number:

        Numbers 0-9
        Exponent - "e"
        Positive/negative sign - "+"/"-"
        Decimal point - "."
        Of course, the context of these characters also matters in the input.


      */
    public static void main( String[] args){
        String[] s = {"0",
        " 0.1 ",
        "abc", 
        "1 a",
        "2e10",
        " -90e3",
        " 1e", 
        "e3",
        " 6e-1",
        " 99e2.5 ",
        "53.5e93",
        " --6 ",
        "-+3",
        "95a54e53",
        
        "959440.94f",
        "1 "};
        for(String k : s)
            System.out.printf("\"%s\" => %s\n", k, sol(k));//string, = , bool
        // System.out.println((int)'0');
    }
    public static boolean sol(String s){
         /* P L A N 
          -run time approx: 
          - create if statements for each para.
          - use ascii code 
          - is there a way to print all Acsii?
          - string is all numbers it is good. 
          - string is a decimal it is good.
          - s can contain the letter e. thats all. 
        */
        
        try{
            
            for(char h : s.replaceAll("\\s","").toCharArray()){
                if((h < (int)'0' || h > (int)'9') && h != '.' && h != '+' && h != '-' && h!= 'e')
                     return false;

            }
            Double.valueOf(s);
            return true;
        }
        catch(Exception e){
            return false;
        }

        
       
       







        /* FUTURE ITERATION
            - try to solvce it in O(n). Convert to char and put it into a hashset. 
            - is it possible to put an array of elements(our case chars) into a set without looping?
            - if possible, than use contains meathod and if it contians any elements in the above if statement: 86 it!
        */
        
    }
    
}