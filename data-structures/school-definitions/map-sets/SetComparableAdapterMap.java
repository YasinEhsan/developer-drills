package mapAndSet;

import trees.AVLTree;

public class SetComparableAdapterMap<K extends Comparable<K>, V> implements Map<K, V> {
   protected Set<ComparableEntry<K, V>> table;

   public SetComparableAdapterMap(Set<ComparableEntry<K, V>> s) {
      table = s;
   }

   public int size() {
      return table.size();
   }

   public boolean isEmpty() {
      return table.isEmpty();
   }

   public V get(K k) {
      try {
         return table.get(new ComparableEntry<K, V>(k, null)).getValue();
      } catch (Exception e) {
         return null;
      }
   }

   public void put(K k, V v) throws Exception {
      table.add(new ComparableEntry<K, V>(k, v));
   }

   public void remove(K k) throws Exception {
      table.remove(new ComparableEntry<K, V>(k, null));
   }

   public Set<K> keySet() throws Exception {
      Set<K> answer = new AVLTree<K>();
      for (Entry<K, V> e : table)
         answer.add(e.getKey());
      return answer;
   }

   public void dumpTable() {
      table.dumpData();
   }
}
