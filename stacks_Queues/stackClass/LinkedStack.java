package stack;

import listNode.Node;

class LinkedStack<T> implements Stack<T> {
   private Node<T> top;
   private int size;

   public LinkedStack() {
      top = null;
      size = 0;
   }

   public int size() {
      return size;
   }

   public boolean empty() {
      return size == 0;
   }

   public T pop() throws Exception {
      if (empty())
         throw new Exception();
      T answer = top.getData();
      top = top.getNext();
      size--;
      return answer;
   }

   public void push(T x) {
      Node<T> newtop = new Node<T>(x, top);
      top = newtop;
      size++;
   }

   public String toString() {
      String ans = "Linked Stack<T>:  ";
      Node<T> n = top;
      while (n != null) {
         ans += (n.getData() + " -> ");
         n = n.getNext();
      }
      return ans;
   }

   public static void main(String args[]) {
      Stack<String> s = new LinkedStack<String>();
      ArrayStack.testStack(s);
   }
}
