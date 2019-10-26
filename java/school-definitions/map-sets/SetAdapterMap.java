package mapAndSet;

import chainedHash.ChainedHashTable;

public class SetAdapterMap<K, V> implements Map<K, V> {
   protected Set<Entry<K, V>> table;

   public SetAdapterMap(Set<Entry<K, V>> s) {
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
         return table.get(new Entry<K, V>(k, null)).getValue();
      } catch (Exception e) {
         return null;
      }
   }

   public void put(K k, V v) throws Exception {
      table.add(new Entry<K, V>(k, v));
   }

   public void remove(K k) throws Exception {
      table.remove(new Entry<K, V>(k, null));
   }

   public Set<K> keySet() throws Exception {
      Set<K> answer = new ChainedHashTable<K>(size());
      for (Entry<K, V> e : table)
         answer.add(e.getKey());
      return answer;
   }

   public void dumpTable() {
      table.dumpData();
   }
}
