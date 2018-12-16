package iterator;

import java.util.Stack;

public class Example2 {
   public static void main(String args[]) {
      Stack<Integer> s = new Stack<>();
      for (int i = 1; i <= 9; i++)
         s.push(i);
      for (Integer x : s)
         System.out.println(x);

      int sum = 0;
      for (Integer x : s)
         sum += x;
      System.out.println("Sum is " + sum);
   }
}
