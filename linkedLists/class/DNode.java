package linkedList;

public class DNode<T> {
   private T data;
   private DNode<T> prev, next;

   public DNode(T d, DNode<T> p, DNode<T> n) {
      data = d;
      next = n;
      prev = p;
   }

   public T getData() {
      return data;
   }

   public DNode<T> getNext() {
      return next;
   }

   public DNode<T> getPrev() {
      return prev;
   }

   public void setData(T d) {
      data = d;
   }

   public void setNext(DNode<T> n) {
      next = n;
   }

   public void setPrev(DNode<T> p) {
      prev = p;
   }
}
