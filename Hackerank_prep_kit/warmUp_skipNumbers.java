import java.util.Scanner;

public class Main {

     // Complete the countingValleys function below.
     static int jumpingOnClouds(int[] c) {
       int jump = 0, pos = 0;
       while(pos < c.length-2){
        if(c[pos+2] == 0)
          pos+=2;
        else
          pos++;
        jump++;
       }
       if(pos < c.length-1)
        jump++;
      return jump;
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n");
        int n = scanner.nextInt();

        while(n!= -1){
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

          System.out.print("Jumps: " + result);
          System.out.println("\n\nenter n");
          n = scanner.nextInt();
        }


      scanner.close();
    }
}
