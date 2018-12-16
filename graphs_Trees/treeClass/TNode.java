package trees;

import java.util.Iterator;

public interface TNode {
   public Iterator<TNode> children();

   public TNode getParent();

   public String printData();
}
