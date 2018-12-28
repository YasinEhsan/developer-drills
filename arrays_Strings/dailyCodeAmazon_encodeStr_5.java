import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class dailyCodeAmazon_encodeStr_5 {
    // This problem was asked by Amazon.

    // Run-length encoding is a fast and simple method of encoding strings. 
    // The basic idea is to represent repeated successive characters as a single count and character. 
    // For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

    // Implement run-length encoding and decoding. 
    // You can assume the string to be encoded have no digits and consists 
    // solely of alphabetic characters. You can assume the string to be 
    // decoded is valid.
    public static void main( String[] args){
        System.out.println("kjhwguefjgh");
    }
    
    public static String sol(String given){
        /*PLAN
            - loop through string. then loop through each seq of chararacter
            - above cud be done using a doiuble for/. while or scanner class
            - in varaible count count # of occuranece
            - appended count and vari to new string 
        */

        String encode = "", current = "";
        
        for(int i = 0; i < given.length(); ++i){
            int count = 0;
            current = given.substring(i,i+1);
            encode += current;
            for(int j = j+1; j < given.length()-1; j++){
               String next = given.substring(j,j+1); 
                if(!current.equals()){
                    break;
                }
                else{

                }
            }
        }
    }
   
    
}