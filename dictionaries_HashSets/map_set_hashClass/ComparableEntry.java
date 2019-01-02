package mapAndSet;

public class ComparableEntry<Key extends Comparable<Key>, Value> extends Entry<Key, Value>  
   implements Comparable<ComparableEntry<Key, Value>>{

   public ComparableEntry(Key k, Value v) {
      super(k, v);
   }

   public int compareTo(ComparableEntry<Key, Value> a) {
      return k.compareTo(a.k);
   }
}
