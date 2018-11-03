import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if((n > 5 && n < 21) || n % 2 == 1)
            System.out.printf("Weird");
        else
            System.out.printf("Not Weird");

        scanner.close();
    }
}
