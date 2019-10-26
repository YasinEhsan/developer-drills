package mapAndSet;

import java.util.Iterator;

public interface Set<E> extends Iterable<E> {
   public int size();

   public boolean isEmpty();

   public boolean contains(E k);

   public E get(E k);

   public void add(E k) throws Exception;

   public void remove(E k) throws Exception;

   public Iterator<E> iterator();

   public void dumpData();
}
