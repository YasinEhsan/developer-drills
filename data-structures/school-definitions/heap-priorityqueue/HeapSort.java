package heap;

import java.util.Arrays;
import java.util.Random;

public class HeapSort {
   public static void main(String args[]) throws Exception {
      Integer[] data = randomizeInts(20);
      System.out.print("Unsorted: ");
      for (int x:data) System.out.print(x + " ");
      System.out.println();
      heapSort(data);
      System.out.print("  Sorted: ");
      for (int x:data) System.out.print(x + " ");
      System.out.println();
   }
   
   private static void heapSort(Integer[] data) throws Exception {
      HeapPriorityQueue<Integer> h = new HeapPriorityQueue<>();
      h.heapify(Arrays.asList(data).iterator());
      for (int i = 0; i < data.length; i++)
         data[i] = h.removeMin();
   }

   private static Integer[] randomizeInts(int cap) {
      Random r = new Random();
      Integer ans[] = new Integer[cap];
      for (int i = 0; i < cap; i++)
         ans[i] = r.nextInt(1000);
      return ans;
   }
}
