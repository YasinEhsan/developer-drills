import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class googleDev1_stringSubsequence_4{
     /*QUESTION
        Given a string S and a set of words D, find the longest word in D that is a subsequence of S.

        Word W is a subsequence of S if some number of characters, possibly zero, can be deleted from S to form W, without reordering the remaining characters.

        Note: D can appear in any format (list, hash table, prefix tree, etc.

        For example, given the input of S = "abppplee" and D = {"able", "ale", "apple", "bale", "kangaroo"} the correct output would be "apple"

        The words "able" and "ale" are both subsequences of S, but they are shorter than "apple".
        The word "bale" is not a subsequence of S because even though S has all the right letters, they are not in the right order.
        The word "kangaroo" is the longest word in D, but it isn't a subsequence of S.  
      */
    public static void main( String[] args){
        System.out.println("kjhwguefjgh");
    }
    public static int sol(String s, Set<String> d){
         /* P L A N 
          -run time approx: 
          - create an array for each string in array and set up counter for the incetamces of string
          - if the number of insteamces is less than the length, then set to zero(meaning not all words are subsequence)
          - this is a theory of computation type problem. Langauges and Grammers
    
        */

        int[] count = new int[d.size()];
        HashSet<String> given = new HashSet<>();
        int i = 0;
        for(char c: s.toCharArray())
            given.add(String.valueOf(c));

        for(String e : d){
            for(char c : e.toCharArray()){
                if(given.contains(String.valueOf(c))){
                    count[i]++;
                }

            }
            if(count[i]!=e.length())
                count[i] = 0;
            ++i;
        }
        
        int greatest = 0;
        
        for(int i : count)
            if(i > greatest)
                greatest = i;
        cd
        
        return;



        /* FUTURE ITERAT
        */
        
    }
    
}