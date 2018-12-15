import java.util.Scanner;

public class Main {

     // Complete the countingValleys function below.
    static long repeatedString(String s, long n) {
      long count = 0;

      for(int i = 0; i < s.length(); i++)
        if(s.substring(i,i+1).equals("a"))
          count++;
      count *= Math.floor(n/s.length());
      for(int i = 0; i < n%s.length(); i++)
        if(s.substring(i,i+1).equals("a"))
          count++;
      return count;
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n******enter string******");
        String s = scanner.nextLine();
        long n = scanner.nextLong();

        while(n!= -1){
          scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
          long result = repeatedString(s, n);

          System.out.print("Occurences: " + result);
          System.out.println("\n\n******enter string******");
          s = scanner.nextLine();
          n = scanner.nextLong();
        }


      scanner.close();
    }
}
