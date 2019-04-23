package listNode;

public class Node<T> {
   private T data;
   private Node<T> next;

   public Node() {
      data = null;
      next = null;
   }

   public Node(T d, Node<T> n) {
      data = d;
      next = n;
   }

   public T getData() {
      return data;
   }

   public Node<T> getNext() {
      return next;
   }

   public void setData(T d) {
      data = d;
   }

   public void setNext(Node<T> n) {
      next = n;
   }

   // Node testing methods

   public String toString() {
      Node<T> seenBefore = this;
      String ans = "";
      int count = 0;
      Node<T> node = this;
      while (node != null) {
         ans += node.getData();
         ans += "-->";
         node = node.getNext();
         if (++count % 2 == 0) seenBefore = seenBefore.getNext();
         if (node == seenBefore) {
            ans += " ... ";
            break;
         }
      }
      return ans + "=";
   }

   public static void main(String args[]) {
      Node<String> c = new Node<String>("C", null);
      Node<String> b = new Node<String>("B", c);
      Node<String> a = new Node<String>("A", b);

      Node<String> d = new Node<String>("D", b);
      c.setNext(d);

      System.out.println(a);
      System.out.println(d);
      System.out.println(b);
   }
}
