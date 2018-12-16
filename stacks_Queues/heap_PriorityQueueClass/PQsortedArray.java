package heap;

public class PQsortedArray<K extends Comparable<K>> implements PriorityQueue<K> {
   K[] data;
   int size;
   int capacity;

   public PQsortedArray() {
      capacity = 100;
      size = 0;
      data = (K[]) new Comparable[capacity];
   }
   public void add(K x) throws Exception {
      if (size >= capacity) throw new Exception("Queue Full");
      int i = size++;
      while (i > 0 && data[i - 1].compareTo(x) < 0) {
         data[i] = data[i - 1];
         i--;
      }
      data[i] = x;
   }

   public K removeMin() throws Exception {
      if (size == 0) throw new Exception("Queue Empty");
      return data[--size];
   }
}
