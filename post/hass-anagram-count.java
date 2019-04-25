// 4.25.19
// Minimum Number of Manipulations required to make two Strings Anagram Without Deletion of Character
// https://www.geeksforgeeks.org/minimum-number-of-manipulations-required-to-make-two-strings-anagram-without-deletion-of-character/

//MAJOR DEBUG : creating new char placeholder at the begining of foremost loop


import java.util.*; // i.e Arrays.sort
import java.io.*; 

class Main {
  public static void main(String[] args) {

    String[] aG = {"ddff", "sdb", "jk", "abc","mnn","abc"};
    String[] bG = {"ddjf", "sgh", "kj", "bbc","opp","djf"};


    List<String> a = new ArrayList<>();
    List<String> b = new ArrayList<>();

    for(String e: aG){
      a.add(e);
      
    }
    for(String e: bG){
      b.add(e);
    }

    List<Integer> c = getMinimumDifference(a, b);
    
   System.out.println("\n\n");


    for(Integer e: c){
      System.out.println(e);
    }

    System.out.println("DONE");

  }

  public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {

      List<Integer> store = new ArrayList<>(); 
      

      for(int i = 0; i < a.size(); ++i){
        int[] aCount = new int[26];
        int[] bCount = new int[26];

        char[] aWord = a.get(i).toCharArray();
        char[] bWord = b.get(i).toCharArray();

        // System.out.printf("i %d | aW  %s | bW %s\n",i, a.get(i), b.get(i));

        // for(char c: aWord){
        //   System.out.printf("%c\n", c);
        // }

        if(aWord.length != bWord.length){
          store.add(-1);
          //  System.out.print("eturn neg one");
          // break;
         
        }
          
        else{




          for(int j = 0; j < aWord.length; ++j){
            aCount[aWord[j] - 'a']++;
            bCount[bWord[j] - 'a']++;
            System.out.printf("j %d | aWord[j] %c %d | bWord[j]  %c %d \n", j, aWord[j], aWord[j] - 'a', bWord[j], bWord[j] - 'a');

          }
          System.out.print("\n\n");


          for(int k = 0; k < aCount.length; k++)
            if(aCount[k] != 0 || bCount[k] != 0)
              System.out.printf("%c  %d %d\n",(char)(k + 97), aCount[k], bCount[k]);

      
          
        
          int diff = aWord.length;
          for(int k = 0; k < aCount.length; ++k){
            if(aCount[k] > 0 && bCount[k] > 0)
              diff -= Math.min(aCount[k], bCount[k]);
          }
          store.add(diff);

          
        }

      }
      return store;
    }


}
