// 4.25.19
// Minimum Number of Manipulations required to make two Strings Anagram Without Deletion of Character
// https://www.geeksforgeeks.org/minimum-number-of-manipulations-required-to-make-two-strings-anagram-without-deletion-of-character/

//MAJOR DEBUG : creating new char placeholder at the begining of foremost loop


import java.util.*;
import java.io.*; 
class Main {
  public static void main(String[] args) {

    String[] aG = {"ddff", "sdb", "jk", "abc","mnn","abc"}, bG = {"ddjf", "sgh", "kj", "bbc","opp","djf"};


    List<String> a = new ArrayList<>(), b = new ArrayList<>();

    for(int i = 0; i < aG.length; ++i){
      a.add(aG[i]);
      b.add(bG[i]);
    }

    List<Integer> c = getMinimumDifference(a, b);

    for(Integer e: c)
      System.out.println(e);
    System.out.println("DONE");

  }

  public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {

      List<Integer> store = new ArrayList<>(); 

      for(int i = 0; i < a.size(); ++i){
        int[] aCount = new int[26], bCount = new int[26];

        char[] aWord = a.get(i).toCharArray(), bWord = b.get(i).toCharArray();

        if(aWord.length != bWord.length)
          store.add(-1);

        else{
          for(int j = 0; j < aWord.length; ++j){
            aCount[aWord[j] - 'a']++;
            bCount[bWord[j] - 'a']++;
          }

          int diff = aWord.length;
          for(int k = 0; k < aCount.length; ++k)
            if(aCount[k] > 0 && bCount[k] > 0)
              diff -= Math.min(aCount[k], bCount[k]);

          store.add(diff);
        }
      }
      return store;
    }

    //GeeksForGeeks solution for single case
    static int countManipulations(String s1, String s2) 
    { 
        int count = 0, char_count[] = new int[26]; 
  
        for (int i = 0; i < s1.length(); i++)  
            char_count[s1.charAt(i) - 'a']++;  

        for (int i = 0; i < s2.length(); i++)  
            if (char_count[s2.charAt(i) - 'a']-- <= 0) 
                count++; 
          
        return count; 
    } 
}
