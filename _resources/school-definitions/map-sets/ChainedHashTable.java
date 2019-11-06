package chainedHash;

import java.util.ArrayList;
import java.util.Iterator;

import mapAndSet.Set;

public class ChainedHashTable<E> implements Set<E> {
   int size;
   int capacity;
   ArrayList<E> bucket[];

   ChainedHashTable() {
      this(1000);
   }

   public ChainedHashTable(int cap) {
      capacity = cap;
      bucket = (ArrayList<E>[]) new ArrayList[cap];
      size = 0;
      for (int i = 0; i < cap; i++)
         bucket[i] = null;
   }

   public int size() {
      return size;
   }

   public boolean isEmpty() {
      return size == 0;
   }

   public E get(E k) {
      int h = k.hashCode() % capacity;
      if (bucket[h] != null) {
         for (int i = 0; i < bucket[h].size(); i++) {
            E p = bucket[h].get(i);
            if (p.equals(k))
               return p;
         }
      }
      return null;
   }
   
   public boolean contains(E k) {
      return get(k) != null;
   }

   public void add(E k) {
      int h = k.hashCode() % capacity;
      if (bucket[h] == null)
         bucket[h] = new ArrayList<>();
      for (int i = 0; i < bucket[h].size(); i++) {
         E p = bucket[h].get(i);
         if (p.equals(k)) {
            bucket[h].set(i, k);
            return;
         }
      }
      bucket[h].add(k);
      size++;
   }

   public void remove(E k) {
      int h = k.hashCode() % capacity;
      if (bucket[h] != null) {
         for (int i = 0; i < bucket[h].size(); i++) {
            E p = bucket[h].get(i);
            if (p.equals(k)) {
               bucket[h].remove(i);
               size--;
               return;
            }
         }
      }
   }
   
   public void dumpData() {
      for (int i = 0; i < capacity; i++) {
         if (bucket[i] != null) {
            System.out.print("" + i + ": ");
            for (int j = 0; j < bucket[i].size(); j++) {
               E p = bucket[i].get(j);
               System.out.print(p);
               if (j < bucket[i].size() - 1) System.out.print(", ");
            }
            System.out.println();
         }
      }
   }

   public Iterator<E> iterator() {
      ArrayList<E> content = new ArrayList<E>();
      for (int i = 0; i < capacity; i++) {
         if (bucket[i] != null) {
            for (int j = 0; j < bucket[i].size(); j++)
               content.add(bucket[i].get(j));
         }
      }
      return content.iterator();
   }
}
