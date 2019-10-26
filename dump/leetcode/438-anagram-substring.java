// 4.26.19
// Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
//https://github.com/cherryljr/LeetCode/blob/master/Sliding%20Window%20Template.java
//


import java.util.*;
import java.io.*; 
class Main {
  public static void main(String[] args) {

    String[] a = {"abab", "ab"};

    findAnagrams(a[0], a[1]);
    

  

  }
  public static List<Integer> findAnagrams(String s, String p) {


   
    List<Integer> store = new ArrayList<>();
    
    for(int i = 0; i < s.length() - p.length() + 1; ++i){
      String inspect = s.substring(i, i + p.length());
      System.out.print(inspect + " " + i + "\n");
      if(isAnagram(inspect, p))
        store.add(i);
    }

    return store;
        
  }
  private static boolean isAnagram(String s, String t) {

  if(s.length() != t.length() )
    return false;

    int [] char_count = new int[26];

    for(int i = 0; i < s.length(); ++i){
      char_count[s.charAt(i) -'a']++;
    } 

    for(int i = 0; i < t.length(); ++i){
      char_count[t.charAt(i) -'a']--;
    }

    for(int e:  char_count)
      if(e > 0)
        return false;
    return true;
        

  }


  
}

/**
 * Approach 3：Using Sliding Window Template
 * Detail explanations about the template is here:
 * https://github.com/cherryljr/LeetCode/blob/master/Sliding%20Window%20Template.java
 */
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> rst = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length()) {
            return rst;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // begin - left of window, end - right of window
        int begin = 0, end = 0;
        // The number of distinct characters
        int counter = map.size();
        
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)){
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    counter--;
                }
            }
            end++;

            while (counter == 0) {
                char tempc = s.charAt(begin);
                if (map.containsKey(tempc)) {
                    map.put(tempc, map.get(tempc) + 1);
                    if (map.get(tempc) > 0) {
                        counter++;
                    }
                }

                if (end - begin == p.length()) {
                    rst.add(begin);
                }
                begin++;
            }
        }

        return rst;
    }
}
