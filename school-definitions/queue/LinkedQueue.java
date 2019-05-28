package queue;

import listNode.Node;

public class LinkedQueue<T> implements Queue<T> {
   protected Node<T> front, rear;
   private int size;

   public LinkedQueue() {
      front = rear = null;
      size = 0;
   }

   public int size() {
      return size;
   }

   public boolean empty() {
      return size == 0;
   }

   public T dequeue() throws Exception {
      if (empty())
         throw new Exception();
      T answer = front.getData();
      front = front.getNext();
      size--;
      if (front == null)
         rear = front;
      return answer;
   }

   public void enqueue(T x) {
      Node<T> newRear = new Node<T>(x, null);
      if (rear != null)
         rear.setNext(newRear);
      else
         front = newRear;
      rear = newRear;
      size++;
   }

   public String toString() {
      String ans = "Linked Queue<T>:  ";
      Node<T> n = front;
      while (n != null) {
         ans += (n.getData() + " -> ");
         n = n.getNext();
      }
      return ans;
   }

   public static void main(String args[]) {
      Queue<String> q = new LinkedQueue<String>();
      ArrayQueue.testQueue(q);
   }
}
