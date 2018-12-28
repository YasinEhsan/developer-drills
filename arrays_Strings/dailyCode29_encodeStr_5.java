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
        System.out.print("hdbc");
        System.out.println(sol("AAAABBBCCDAAA"));
    }
    
    public static String sol(String given){
        /*PLAN
            - loop through string. then loop through each seq of chararacter
            - above cud be done using a while or scanner class
            - in varaible count count # of occuranece
            - appended count and vari to new string 
        */

        String encode = "", store = given + " ";
        int j = 0, count = 0;

        while(j <= given.length() - count){
            String current = store.substring(j,j+1);
            String next = store.substring(j+ count, j + count+1); 

            if(!current.equals(next)){
                j+= count;
                encode += Integer.toString(count);
                encode += current;
                count = 0;
            }
            else
                 count++;
        } 
        return encode;
    }
   
    
}