// import java.io.*;
public class leet804_morseCode_5{
    public static void main( String[] args){
        String[] words = {"gin", "zen", "gig", "msg"};
        String[] encoded = sol(words);
        for(String e: encoded)
            System.out.println(e);

    }
    public static String[] sol(String[] words) {
        String[] decode = {".-","-...","-.-.","-..",".","..-.",
        "--.","....","..",".---","-.-",".-..","--","-.","---",
        ".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
        "-.--","--.."};

        String[] encode = new String[words.length];

        for(int i = 0; i<words.length; i++){
            char[] store = words[i].toCharArray();
            encode[i] = "";
            for(int j = 0; j < store.length;j++){
                int ascii = (int) store[j];
                encode[i] += decode[ascii - 97];
            }
        }

        int count = 0; 

        for(int i = 0; i<encode.length-1; ++i)
            if(!encode[i].equals(encode[i+1]))
                count++;

        return encode;
        
    }
    
}