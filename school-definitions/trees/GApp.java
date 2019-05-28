package trees;

import java.util.Iterator;
import java.util.Scanner;

public class GApp {
   public static void main(String args[]) {
      GeneralTree<String> tree = new GeneralTree<>();
      testTree(tree);
   }

   public static void testTree(GeneralTree<String> tree) {
      GTNode<String> markedPosition = null;
      Scanner input = new Scanner(System.in);
      while (true) {
         try {
            System.out.println(
                  tree.treePrint(markedPosition) + "  commands act at the *cursor*:  + - > >^ >- >> H S Q:");
            String cmd = input.next();
            if (cmd.charAt(0) == 'Q')
               break;
            else if (cmd.charAt(0) == 'H')
               System.out.println(tree.height());
            else if (cmd.charAt(0) == 'S')
               System.out.println(tree.size());
            else if (cmd.charAt(0) == '-' && markedPosition != null) {
               tree.remove(markedPosition);
               markedPosition = null;
            } else if (cmd.charAt(0) == '+') {
               String entry = input.next();
               if (markedPosition == null && tree.root == null)
                  tree.add(entry);
               if (markedPosition != null)
                  tree.add(markedPosition, entry);
            }
            if (cmd.charAt(0) == '>') {
               try {
                  if (cmd.length() == 1)
                     markedPosition = (GTNode<String>) tree.root();
                  else if (cmd.charAt(1) == '^')
                     markedPosition = (GTNode<String>) markedPosition.getParent();
                  else if (cmd.charAt(1) == '-') {
                     GTNode<String> p = (GTNode<String>) markedPosition.getParent();
                     Iterator<TNode> sibs = p.children();
                     while (sibs.hasNext() && sibs.next() != markedPosition)
                        ;
                     markedPosition = (GTNode<String>) sibs.next();
                  } else if (cmd.charAt(1) == '>')
                     markedPosition = (GTNode<String>) markedPosition.children().next();
               } catch (Exception e) {
                  markedPosition = null;
               }
            }
         } catch (Exception e) {
            System.out.println(e);
         }
      }
      input.close();
   }
}
