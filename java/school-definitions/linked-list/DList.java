package linkedList;

import java.util.Scanner;

// doubly linked list, uses header and trailer sentinels.

public class DList<T> {
   private DNode<T> header, trailer;
   private int size;

   public DList() {
      size = 0;
      header = new DNode<T>(null, null, null);
      trailer = new DNode<T>(null, header, null);
      header.setNext(trailer);
   }

   // utility methods

   public int size() {
      return size;
   }

   public boolean isEmpty() {
      return size == 0;
   }

   // give clients access to nodes, but not to the header or trailer

   public DNode<T> getFirst() throws Exception {
      if (isEmpty())
         throw new Exception("Empty");
      return header.getNext();
   }

   public DNode<T> getLast() throws Exception {
      if (isEmpty())
         throw new Exception("Empty");
      return trailer.getPrev();
   }

   public DNode<T> getNext(DNode<T> v) throws Exception {
      DNode<T> ans = v.getNext();
      if (ans == null || ans == trailer)
         throw new Exception("No such node");
      return ans;
   }

   public DNode<T> getPrev(DNode<T> v) throws Exception {
      DNode<T> ans = v.getPrev();
      if (ans == null || ans == header)
         throw new Exception("No such node");
      return ans;
   }

   // methods to change the list

   public void addBefore(T d, DNode<T> v) {
      DNode<T> u = v.getPrev();
      DNode<T> x = new DNode<T>(d, u, v);
      u.setNext(x);
      v.setPrev(x);
      size++;
   }

   public void addAfter(T d, DNode<T> v) {
      DNode<T> w = v.getNext();
      DNode<T> x = new DNode<T>(d, v, w);
      v.setNext(x);
      w.setPrev(x);
      size++;
   }

   public void addFirst(T d) throws Exception {
      addAfter(d, header);
   }

   public void addLast(T d) throws Exception {
      addBefore(d, trailer);
   }

   public T remove(DNode<T> v) throws Exception {
      if (v == header || v == trailer)
         throw new Exception("Sentinel");
      DNode<T> u = v.getPrev();
      DNode<T> w = v.getNext();
      w.setPrev(u);
      u.setNext(w);
      size--;
      return v.getData();
   }

   // LinkedList testing methods:

   public String toString() {
      String ans = "";
      DNode<T> n = header;
      ans += "(H)<-->";
      do {
         n = n.getNext();
         if (n == trailer)
            ans += "(T)";
         else
            ans += (n.getData() + "<-->");
      } while (n != trailer);
      return ans;
   }

   public static void main(String args[]) {
      DList<String> list = new DList<String>();
      DNode<String> cursor = null;
      boolean done = false;
      Scanner s = new Scanner(System.in);
      while (!done) {
         try {
            System.out.print(list + "  ");
            if (cursor != null && cursor.getData() != null)
               System.out.print(" ^^ " + cursor.getData());
            System.out.println("\ncmds are H(elp) F L B A R + - Q: >>");
            String cmd = s.next().trim().toUpperCase();
            String entry = null;
            char command = cmd.charAt(0);
            if (command == 'F' || command == 'L' || command == 'B'
                  || command == 'A')
               entry = s.next();
            switch (cmd.charAt(0)) {
            case 'Q':
               done = true;
               break;
            case 'H':
               String help = "H: Help \n" + "F x: Add x at first place\n"
                     + "L x: Add x at last place\n"
                     + "B x: Add x before the cursor\n"
                     + "A x: Add x after the cursor\n"
                     + "A x: Add x after the cursor\n"
                     + "+  : Advance the cursor\n"
                     + "-  : Move the cursor back\n";
               System.out.print(help);
               break;
            case 'R':
               DNode<String> e = cursor.getNext();
               list.remove(cursor);
               cursor = e;
               if (cursor == list.trailer)
                  cursor = cursor.getPrev();
               break;
            case '+':
               cursor = list.getNext(cursor);
               break;
            case '-':
               cursor = list.getPrev(cursor);
               break;
            case 'F':
               list.addFirst(entry);
               cursor = list.getFirst();
               break;
            case 'L':
               list.addLast(entry);
               cursor = list.getLast();
               break;
            case 'B':
               list.addBefore(entry, cursor);
               cursor = list.getPrev(cursor);
               break;
            case 'A':
               list.addAfter(entry, cursor);
               cursor = list.getNext(cursor);
               break;
            }
         } catch (Exception e) {
            System.out.println("Command failed because: " + e.toString());
         }
      }
      s.close();
   }
}
