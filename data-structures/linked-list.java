import java.util.*;
import java.io.*; 

public class Main{
  public static void main(String[] args){
     LinkedList<String> linkedList = new LinkedList<>();

    //4 WAYS LOOP THRU A LIST
    for (int i = 0; i < linkedList.size(); i++) 
      System.out.println(linkedList.get(i));
    
    for (String temp : linkedList) 
      System.out.println(temp);
    
    Iterator<String> iterator = linkedList.iterator();
    while (iterator.hasNext()) 
        System.out.println(iterator.next()); 
    
   int i = 0;
    while (i < linkedList.size()) {
        System.out.println(linkedList.get(i));
        i++;
    }

    
  }
}
