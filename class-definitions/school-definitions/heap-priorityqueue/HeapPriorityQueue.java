package heap;

import java.util.Iterator;

public class HeapPriorityQueue<K extends Comparable<K>> implements
      PriorityQueue<K> {
   private K data[];
   private int size;
   private int capacity;

   // constructors
   public HeapPriorityQueue() {
      capacity = 100;
      size = 0;
      data = (K[]) new Comparable[capacity];
   }

   public HeapPriorityQueue(int c) {
      capacity = c;
      size = 0;
      data = (K[]) new Comparable[capacity];
   }

   // required priority queue methods
   public void add(K x) throws Exception {
      if (size >= capacity - 1)
         throw new Exception("Priority Queue Full");
      data[size++] = x;
      bubbleUp(size - 1);
   }

   public K removeMin() throws Exception {
      if (size <= 0)
         throw new Exception("Priority Queue Empty");
      swapData(0, --size);
      bubbleDown(0);
      return data[size];
   }

   // auxiliary utility methods
   private void swapData(int n, int m) {
      K temp = data[n];
      data[n] = data[m];
      data[m] = temp;
   }

   private void bubbleUp(int n) {
      if (n <= 0)
         return; // at root
      K dn = data[n];
      K dp = data[(n - 1) / 2]; // parent data
      if (dn.compareTo(dp) >= 0)
         return; // no problems
      swapData(n, (n - 1) / 2);
      bubbleUp((n - 1) / 2);
   }

   public void bubbleDown(int n) {
      if (2 * n + 1 >= size)
         return; // at leaf
      K dn = data[n];
      K dl = data[2 * n + 1]; // left child
      K dr = dl;
      if (2 * n + 2 < size)
         dr = data[2 * n + 2]; // right child
      if (dn.compareTo(dl) < 0 && dn.compareTo(dr) < 0)
         return; // no problems
      if (dr.compareTo(dl) < 0) {
         swapData(n, 2 * n + 2);
         bubbleDown(2 * n + 2);
      } else {
         swapData(n, 2 * n + 1);
         bubbleDown(2 * n + 1);
      }
   }

   // heap creation
   public void heapify(Iterator<K> x) throws Exception {
      while (x.hasNext()) {
         if (size + 1 == capacity)
            break;
         data[size++] = x.next();
      }
      int n = size / 2;
      while (--n >= 0)
         bubbleDown(n);
      if (x.hasNext())
         throw new Exception("Heap is Full");
   }

}
