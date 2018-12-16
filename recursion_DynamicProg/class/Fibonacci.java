package recursiveFibs;

// Example of very bad use of recursion, with timings

import java.math.BigInteger;

public class Fibonacci {
   public static BigInteger fibonacci(int n) {
      if (n <= 1)
         return BigInteger.valueOf(n);
      return fibonacci(n - 1).add(fibonacci(n - 2));
   }

   public static void main(String args[]) {
      long time = System.currentTimeMillis();
      for (int i = 0; i < 200; i++) {
         System.out.print("F(" + i + ") = " + fibonacci(i));
         long nextTime = System.currentTimeMillis();
         System.out.println(" Time used: " + (nextTime - time)
               + " milliseconds");
         time = nextTime;
      }
   }

}
