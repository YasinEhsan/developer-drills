package trees;

import java.util.Scanner;

public class AVLApp {
   public static void main(String args[]) {
      AVLTree<String> searchTree = new AVLTree<String>();
      Scanner input = new Scanner(System.in);
      try {
         while (true) {
            System.out.println(searchTree.toString() + "  :cmds are +(add) -(remove)  H(eight) Q(uit): ");
            String cmd = input.next();
            if (cmd.charAt(0) == 'Q')
               break;
            if (cmd.charAt(0) == 'H') {
               System.out.println("Height " + searchTree.height());
               continue;
            }
            if (cmd.charAt(0) == '-') {
               String entry = input.next();
               searchTree.remove(entry);
            }
            if (cmd.charAt(0) == '+') {
               String entry = input.next();
               searchTree.add(entry);
            }
         }
      } catch (Exception e) {
         System.out.println(e);
      }
      input.close();
   }
}
