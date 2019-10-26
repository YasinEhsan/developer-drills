package iterator;

import java.util.Iterator;
import java.util.Stack;

public class IteratorExample {
   public static void main(String args[]) {
      Stack<Integer> s = new Stack<>();
      for (int i = 1; i <= 9; i++)
         s.push(i);

      Iterator<Integer> x = s.iterator();
      while (x.hasNext())
         System.out.println(x.next());
   }
}
