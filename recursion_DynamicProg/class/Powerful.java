package recursivePowers;

import java.math.BigInteger;

class Powerful {

   public static BigInteger power(BigInteger x, int n) {
      if (n <= 0)
         return BigInteger.valueOf(1);
      BigInteger y = power(x, n / 2);
      BigInteger z = y.multiply(y);
      if (n % 2 == 0)
         return z;
      return z.multiply(x);
   }

   public static BigInteger slowPower(BigInteger x, int n) {
      BigInteger answer = BigInteger.valueOf(1);
      for (int i = 1; i <= n; i++)
         answer = answer.multiply(x);
      return answer;
   }

   public static void main(String args[]) {
      for (int i = 1; i <= 1000; i *= 10)
         System.out.println("" + i + ": \t"
               + power(BigInteger.valueOf(2), i));
      int i = 250000;
      System.out.println("Fast power");
      System.out.println("" + i + ": \t"
            + sPrint(power(BigInteger.valueOf(2), i).toString()));
      System.out.println("Slow power");
      System.out.println("" + i + ": \t"
            + sPrint(slowPower(BigInteger.valueOf(2), i).toString()));
   }

   private static String sPrint(String string) {
      String ans = "";
      int i = 0;
      while (i < 60 && i < string.length()) {
         ans += string.charAt(i);
         if (i % 80 == 79)
            ans += "\n";
         i++;
      }
      if (string.length() >= 60)
         ans += "...";
      return ans + "...";
   }
}
