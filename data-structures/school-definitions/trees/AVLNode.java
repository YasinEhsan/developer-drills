package trees;

public class AVLNode<K extends Comparable<K>> extends BinNode<K> {
   public int leftChildHt, rightChildHt;

   public static int max(int x, int y) {
      if (x > y)
         return x;
      return y;
   }

   public int fixHt() {
      leftChildHt = rightChildHt = -1;
      AVLNode<K> l = (AVLNode<K>) getLeft();
      AVLNode<K> r = (AVLNode<K>) getRight();
      if (l != null)
         leftChildHt = 1 + max(l.leftChildHt, l.rightChildHt);
      if (r != null)
         rightChildHt = 1 + max(r.leftChildHt, r.rightChildHt);
      if (leftChildHt > rightChildHt)
         return leftChildHt;
      return rightChildHt;
   }

   public AVLNode(AVLNode<K> parent, AVLNode<K> leftChild, AVLNode<K> rightChild, K d) {
      super(parent, leftChild, rightChild, d);
      fixHt();
   }
}
