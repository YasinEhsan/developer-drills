package sorting;

public class QuickSort<K extends Comparable<K>> extends Sort<K> {
   public QuickSort(K[] x) {
      super(x);
   }

   public int partition(int low, int high) {
      K pivot = array[low];
      if (pivot.compareTo(array[high]) < 0)
         pivot = array[high];
      else if (pivot.equals(array[high]))
         low++;

      while (low < high) {
         while (array[low].compareTo(pivot) < 0)
            low++;
         while (high >= low && array[high].compareTo(pivot) >= 0)
            high--;
         if (low < high)
            swap(low, high);
      }
      return low;
   }

   public void swap(int x, int y) {
      K temp = array[x];
      array[x] = array[y];
      array[y] = temp;
   }

   public void merge(int low, int mid, int high) {
   }
   
   public String sortType() {
      return "Quick Sort";
   }
}
