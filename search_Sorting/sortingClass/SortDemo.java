package sorting;

import java.util.Random;

public class SortDemo {
   public static void main(String args[]) {
      for (int i = 0; i < 2; i++) {
         Integer[] data = randomizeInts(20);
         Sort<Integer> s = null;
         if (i == 0) s = new MergeSort<Integer>(data);
         else s = new QuickSort<Integer>(data);
         s.print();
         s.sort(0, 19);
         System.out.println("\nSorted using " + s.sortType() + "\n");
         s.print();
         System.out.println("\n-----------------------------------\n");
      }
   }

   private static Integer[] randomizeInts(int cap) {
      Random r = new Random();
      Integer ans[] = new Integer[cap];
      for (int i = 0; i < cap; i++)
         ans[i] = r.nextInt(1000);
      return ans;
   }
}
