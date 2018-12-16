package heap;

import java.util.Scanner;

public class HeapPQApp {
   // menu driven program to test the heap implementation
   public static void main(String args[]) {
      HeapPriorityQueue<String> pq = new HeapPriorityQueue<String>();
      boolean done = false;
      Scanner sc = new Scanner(System.in);
      while (!done) {
         try {
            System.out.println("\ncmds are + - Q: >>");
            String cmd = sc.next();
            String entry = null;
            char command = cmd.charAt(0);
            if (command == '+')
               entry = sc.next();
            switch (cmd.charAt(0)) {
            case 'Q':
               done = true;
               break;
            case '+':
               pq.add(entry);
               break;
            case '-':
               System.out.println(pq.removeMin());
               break;
            }
         } catch (Exception e) {
            System.out.println("Error " + e.toString());
         }
      }
      sc.close();
   }
}
