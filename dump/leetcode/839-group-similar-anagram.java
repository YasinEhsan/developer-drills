/* 5.2.19
Two strings X and Y are similar if we can swap two letters (in different positions) of X, so that it equals Y.

For example, "tars" and "rats" are similar (swapping at positions 0 and 2), and "rats" and "arts" are similar, but "star" is not similar to "tars", "rats", or "arts".

Together, these form two connected groups by similarity: {"tars", "rats", "arts"} and {"star"}.  Notice that "tars" and "arts" are in the same group even though they are not similar.  Formally, each group is such that a word is in the group if and only if it is similar to at least one other word in the group.

We are given a list A of strings.  Every string in A is an anagram of every other string in A.  How many groups are there?

Example 1:

Input: ["tars","rats","arts","star"]
Output: 2
*/

import java.util.*;
import java.io.*; 
class Main {
  public static void main(String[] args) {
    
    String[] s ={"tars","rats","arts","star"};

    //Test all combination pairs: s.length choose 2
    printMap(pairCombinations(s));

    // numSimilarGroups(s);

   
  

  }
  
  public static int numSimilarGroups(String[] a) {
    // HashSet<String> groups = pairCombinations(a);
    // String ideal = "";

    // for(int i = 0; i < a.length; ++i){
    //   ideal += Integer.toString(i) + ",";
    // }

    // while(!matchesIdeal(groups, ideal)){

    // }

    return 0;
  }
  public static boolean validGroup(String a, String b){
    char[] splitA = a.toCharArray();
    char[] splitB = b.toCharArray();

    int difPos = 0;

    for(int i = 0; i < a.length(); ++i){
      if(!(splitA[i] == splitB[i]))
        difPos++;
    }
    return difPos == 2;
  }
  public static Set<Set<String>> pairCombinations(String[] s){
    Set<Set<String>> groups = new HashSet<>();

    for(int i = 0; i < s.length; ++i){
      groups.add(new HashSet<>(Integer.toString(i)));
    }

    for(int i = 0; i < s.length - 1; ++i){
      for(int j = i+1; j <  s.length; ++j){

        if(validGroup(s[i], s[j])){
          // groups.remove(Integer.toString(i));
          // groups.remove(Integer.toString(j));
          

          String[] key = {Integer.toString(i), Integer.toString(j)};
          groups.add(new HashSet<>(key));
        }
      }
    }

    return groups;
  }
  public static boolean matchesIdeal(HashSet<String> given, String ideal){

    String status = "";

    for(String e : given){
      status += e + ",";
    }

    System.out.print("here: " + status);

    return status.equals(ideal);
  }
  // public static void removeCommon(HashSet<String> h){

  //   List<String> store = new ArrayList<>();
  //   for(String e : h){
  //     store.add(e);
  //   }

  //   for(int i = 0; i < store.size() -1; ++i){
  //     char[] first = store.get(i).toCharArray();

  //     for(int j = i; j < store.size() -1; ++j){
  //       char[] sec = store.get(i).toCharArray();

        
  //     }
  //   }

  //   for(String e : h){
  //     String curr = "";
  //     for(int i = 0; i < e.length(); ++i){
  //       curr += e.substring(i, i+1);
  //       if(h.contains(curr)){

  //       }
  //     }
  //   }
      
  // }

  public static void printMap(Set<Set<String>> given){

    for(HashSet<String> e : given)
      System.out.printf("%s\n",e);
    System.out.printf("\n");
  }


 
}


  




  
  
