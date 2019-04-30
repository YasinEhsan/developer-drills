/* 4.29.19
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
*/

import java.util.*;
import java.io.*; 
class Main {
  public static void main(String[] args) {
   String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
   System.out.println(isAnagram(s[0], s[1]));

   LinkedList<LinkedList<YourClass>> list = new LinkedList<LinkedList<String>>();

   for(LinkedList l : list){
     for(String e : l){
       System.out.printf("%s ",e);
     }
      System.out.printf("\n");

  }

  
  //METHOD 1. n^3 runtime. Could'nt run to scale
  public static List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> list = new ArrayList<>();

    for(int i = 0; i < strs.length; ++i){
      if(strs[i].equals("0"))
        continue;
      else{
        ArrayList<String> store = new ArrayList<>();
        store.add(strs[i]);
        for(int j = i + 1; j < strs.length; ++j){
          if(isAnagram(strs[i], strs[j])){
            store.add(strs[j]);
            strs[j] = "0";
          }
        }
        list.add(store);
        strs[i] = "0";
      }
    }

    return list;
        
  }

  public static boolean isAnagram(String a, String b){
    Map<String, Integer> map = new HashMap<>();

    if(a.length() != b.length()){
      return false;
    }
    
    for(int i = 0; i < a.length(); ++i){
      setKeyVal(map, 1, a.substring(i, i+1));
    }
    // print(map);
    for(int i = 0; i < b.length(); ++i){
      setKeyVal(map, -1, b.substring(i, i+1));
    }
    // print(map);

    for(Integer e : map.values()){
     if(!(e == 0))
      return false;
    }

    return true;
  }

  private static void setKeyVal(Map<String, Integer> map, int n, String key){
    if(map.containsKey(key))
      map.put(key, map.get(key) + n);
    else
      map.put(key, 1);

  }
  private static void print(Map<String, Integer> map){
    for(Map.Entry<String, Integer> e : map.entrySet()){
      String key = e.getKey();
      Integer val = e.getValue();

      System.out.printf("%s %d\n", key, val);
    }

     System.out.printf("DONE\n\n");
  }
}
