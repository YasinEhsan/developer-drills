// 4.26.19
// Given two strings s and t , write a function to determine if t is an anagram of s.


import java.util.*;
import java.io.*; 
class Main {
  public static void main(String[] args) {

  

  }
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
