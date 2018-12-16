package sorting;

public class MergeSort<K extends Comparable<K>> extends Sort<K> {

   public MergeSort(K[] x) {
      super(x);
   }

   public int partition(int low, int high) {
      return (low + high + 1) / 2;
   }

   public void merge(int low, int mid, int high) {
      K m[] = (K[]) new Comparable[high + 1 - low];
      int x = low, y = mid, z = 0;
      while (x < mid) {
         if (y <= high && array[y].compareTo(array[x]) < 0)
            m[z++] = array[y++];
         else
            m[z++] = array[x++];
      }
      while (y <= high)
         m[z++] = array[y++];
      for (int i = low; i <= high; i++)
         array[i] = m[i - low];
   }

   public String sortType() {
      return "Merge Sort";
   }
}
