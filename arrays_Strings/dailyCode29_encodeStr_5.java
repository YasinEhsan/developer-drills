import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class dailyCode29_encodeStr_5 {
    // This problem was asked by Amazon.

    // Run-length encoding is a fast and simple method of encoding strings. 
    // The basic idea is to represent repeated successive characters as a single count and character. 
    // For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

    // Implement run-length encoding and decoding. 
    // You can assume the string to be encoded have no digits and consists 
    // solely of alphabetic characters. You can assume the string to be 
    // decoded is valid.
    public static void main( String[] args){
        System.out.println(sol("AAAABBBCCDAA"));
    }
    
    public static String sol(String given){
        /*PLAN
            - loop through string. then loop through each seq of chararacter
            - above cud be done using a while or scanner class
            - in varaible count count # of occuranece
            - appended count and vari to new string 
        */

        String encode = "";
        int j = 0;

        while(j <= given.length()){
            int count = 0;
            String current = given.substring(j,j+1);
            String next = given.substring(count,count+1); 

            if(!current.equals(next)){
                j++;
                encode += Integer.toString(count);
                encode += current;
                count = 0;
                System.out.println("if cu: "+ current);
                System.out.println("if ne: " + next); 
            }
            else{
                count++;
                System.out.println("else cu: "+ current);
                System.out.println("else ne: " + next);
            }
        } 
        return encode;
        
    }
   
    
}