import java.util.Scanner;

public class Main {

    //method 1
    static int sockMerchant(int n, int[] ar) {
      int pairs = 0;
      int[] store = new int[101];

      for(int e: ar)
        store[e]++;

      for(int e: store)
        pairs += e/2;
        // if(e >=2)
        //   pairs = pairs + (e - e%2)/2;
      return pairs;
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n");

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.print("pairs: " + result);

        scanner.close();
    }
}
