package iterator;

import java.util.Iterator;

import listNode.Node;
import queue.ArrayQueue;
import queue.LinkedQueue;
import queue.Queue;

public class ItQueue<T> extends LinkedQueue<T> implements Queue<T>, Iterable<T> {

   public Iterator<T> iterator() {
      return new QueueIterator<T>(front);
   }

   public String toString() { // override toString method to apply the iterator
      String ans = "ItQueue<T>:  ";
      for (T x : this)
         ans += x + " ";
      return ans;
   }

   public static void main(String args[]) {
      ItQueue<String> q = new ItQueue<String>();
      ArrayQueue.testQueue(q);
   }
}

class QueueIterator<T> implements Iterator<T> {

   private Node<T> current;

   public QueueIterator(Node<T> c) {
      current = c;
   }

   public T next() {
      T answer = current.getData();
      current = current.getNext();
      return answer;
   }

   public boolean hasNext() {
      return current != null;
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

}
