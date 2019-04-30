package mapAndSet;

public interface Map<K, V> {
   public int size();

   public boolean isEmpty();

   public V get(K k);

   public void put(K k, V v) throws Exception;

   public void remove(K k) throws Exception;

   public Set<K> keySet() throws Exception;

   public void dumpTable();
}
