package chainedHash;

import java.util.Scanner;

import mapAndSet.Entry;
import mapAndSet.Map;
import mapAndSet.SetAdapterMap;

public class ChainedHashTableDemo {

   public static void main(String args[]) {
      ChainedHashTable<Entry<String, String>> table = 
            new ChainedHashTable<Entry<String, String>>(4);
      Map<String, String> m = new SetAdapterMap<>(table);
      testMap(m);
   }

   public static void testMap(Map<String, String> m) {
      boolean done = false;
      Scanner sc = new Scanner(System.in);
      while (!done) {
         try {
            System.out.println("\ncmds are + - D F Q: >>");
            String cmd = sc.next();
            String key = null;
            String value = null;
            char command = cmd.charAt(0);
            if (command != 'Q' && command != 'D')
               key = sc.next();
            if (command == '+')
               value = sc.next();
            switch (cmd.charAt(0)) {
            case 'Q':
               done = true;
               value = null;
               break;
            case 'D':
               m.dumpTable();
               break;
            case '+':
               m.put(key, value);
               break;
            case '-':
               m.remove(key);
               break;
            case 'F':
               System.out.println(m.get(key));
               break;
            }
         } catch (Exception e) {
            System.out.println("Error " + e.toString());
         }
      }
      sc.close();
   }
}
