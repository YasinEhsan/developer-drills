// 4.26.19 - returned 4.29.19
// Given two strings s and t , write a function to determine if t is an anagram of s.


import java.util.*;
import java.io.*; 
class Main {
  public static void main(String[] args) {
   String[] s = {"ppeek", "keepm"};

   System.out.println(isAnagram(s[0], s[1]));//prints false
  

  }
  //n : Dictionary 
  public static boolean isAnagram(String s, String t) {

  if(s.length() != t.length() )
    return false;

  HashMap<String,Integer> map = new HashMap<>();

  //put a-z in map
  for(int i = 'a'; i <= 'z'; ++i)
    map.put(String.valueOf((char)i), 0);

  for(int i = 0; i < s.length(); i++){
    String key = s.substring(i, i+1);
    map.put(key, map.get(key) + 1);
  }
  print(map);

  for(int i = 0; i < t.length(); i++){
    String key = t.substring(i, i+1);
    map.put(key, map.get(key) - 1);
  }
  print(map);

  for(Integer e: map.values())
    if(e < 0)
      return false;

  return true;
  }

  private static void print(Map<String, Integer> map){
    for(Map.Entry<String, Integer> e : map.entrySet()){
      String key = e.getKey();
      Integer val = e.getValue();

      System.out.printf("%s %d\n", key, val);
    }

     System.out.printf("DONE\n\n");
  }
  
  
  //n^2
  public boolean isAnagram(String s, String t) {

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
