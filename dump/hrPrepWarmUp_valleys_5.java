import java.util.Scanner;

public class Main {

     // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
      int valleys = 0, sum = 0;
      int[] store = new int[n];


      for(int i =0; i <n; i++){
        if(s.substring(i, i+1).equalsIgnoreCase("U"))
          store[i]=1;
        else
          store[i]=-1;
      }
      boolean state;
      for(int e: store){
        state = false;
        if(sum < 0)
          state = true;
        sum += e;
        if(sum == 0 && state)
          valleys++;
      }

      return valleys;

    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n");
        int n = scanner.nextInt();

        while(n!= -1){
          scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
          String s = scanner.nextLine();
          int result = countingValleys(n, s);

          System.out.print("VALLEYS: " + result);
          System.out.println("\n\nenter n");
          n = scanner.nextInt();
        }


      scanner.close();
    }
}
