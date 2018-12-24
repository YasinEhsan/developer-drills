import java.util.Scanner;

import listNode.Node;

public class LinkedList<T> {
   // instance variables
   private Node<T> head, tail;
   private int size;

   // constructor
   public LinkedList() {
      head = tail = null;
      size = 0;
   }

   // utility methods

   public int size() {
      return size;
   }

   public boolean isEmpty() {
      return size == 0;
   }

   // methods to change the list

   public void addHead(T d) {
      Node<T> n = new Node<T>(d, head);
      head = n;
      size++;
      if (tail == null)
         tail = head;
   }

   public void addTail(T d) {
      Node<T> n = new Node<T>(d, null);
      if (tail == null)
         head = tail = n;
      else {
         tail.setNext(n);
         tail = n;
      }
      size++;
   }

   public T removeHead() throws Exception {
      if (head == null)
         throw new Exception("Empty List");
      Node<T> n = head;
      head = head.getNext();
      if (head == null)
         tail = head;
      size--;
      return n.getData();
   }

   // LinkedList testing methods:

   public String toString() {
      String ans = "";
      Node<T> n = head;
      ans += "(H)-->";
      while (n != null) {
         ans += n.getData();
         ans += "-->";
         n = n.getNext();
      }
      return ans + "(T)";
   }

   public static void main(String args[]) {
      LinkedList<String> l = new LinkedList<String>();
      Scanner s = new Scanner(System.in);
      while (true) {
         System.out.println(l + "  :cmds are H T R Q: ");
         String cmd = s.next();
         if (cmd.charAt(0) == 'Q')
            break;
         if (cmd.charAt(0) == 'R')
            try {
               l.removeHead();
            } catch (Exception e) {
               System.out
                     .println("Remove failed.  List was already empty!");
            }
         else {
            String entry = s.next();
            if (cmd.charAt(0) == 'H')
               l.addHead(entry);
            if (cmd.charAt(0) == 'T')
               l.addTail(entry);
         }
      }
      s.close();
   }
}
