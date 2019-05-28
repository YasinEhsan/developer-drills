package heap;

public class PQunsortedArray<K extends Comparable<K>> implements PriorityQueue<K> {
   K[] data;
   int size;
   int capacity;

   public PQunsortedArray() {
      capacity = 100;
      size = 0;
      data = (K[]) new Comparable[capacity];
   }
   
   // easy insertion
   public void add(K x) throws Exception {
      if (size >= capacity) throw new Exception("Queue full");
      data[size++] = x;
   }

   public K removeMin() throws Exception {
      if (size == 0) throw new Exception("Queue Empty");
      int minIndex = 0;
      for (int i = 1; i < size; i++)
         if (data[i].compareTo(data[minIndex]) < 0)
            minIndex = i;
      K ans = data[minIndex];
      data[minIndex] = data[--size];
      return ans;
   }
}
