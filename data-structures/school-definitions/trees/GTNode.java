package trees;

import java.util.ArrayList;
import java.util.Iterator;

public class GTNode<T> implements TNode {

   T data;
   GTNode<T> parent;
   private ArrayList<TNode> children;

   public GTNode(T d, GTNode<T> p) {
      parent = p;
      data = d;
      children = new ArrayList<TNode>();
   }

   public Iterator<TNode> children() {
      return children.iterator();
   }

   @Override
   public TNode getParent() {
      return parent;
   }

   @Override
   public String printData() {
      return data.toString();
   }

   public void add(GTNode<T> n) {
      children.add(n);
   }

   public void add(int i, GTNode<T> n) {
      children.add(i, n);
   }

   public GTNode<T> get(int i) {
      return (GTNode<T>) children.get(i);
   }

   public int numberChildren() {
      return children.size();
   }

   public int size() {
         int count = 1;
         Iterator<TNode> x = children();
         while (x.hasNext())
            count += ((GTNode<T>) x.next()).size();
         return count;
      }

   public void remove(GTNode<T> x) {
      children.remove(x);
   }
}
