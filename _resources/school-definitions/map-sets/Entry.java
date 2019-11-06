package mapAndSet;

public class Entry<Key, Value> {
   protected Key k;
   protected Value v;

   public int hashCode() {
      return k.hashCode();
   }

   public boolean equals(Object x) {
      Key kk;
      try {
         kk = (Key) ((Entry) x).k;
      } catch (Exception e) {
         return false;
      }
      return k.equals(kk);
   }

   public Key getKey() {
      return k;
   }

   public void setKey(Key k) {
      this.k = k;
   }

   public Value getValue() {
      return v;
   }

   public void setValue(Value v) {
      this.v = v;
   }

   public Entry(Key k, Value v) {
      this.k = k;
      this.v = v;
   }

   public String toString() {
      return k + "->" + v;
   }
}
