package trees;

import java.util.ArrayList;
import java.util.Iterator;

import mapAndSet.Set;

public class AVLTree<K extends Comparable<K>> extends BinTree<K> implements Set<K>{
   
   public AVLTree() {
      super();
   }
   
   // new add and remove methods are similar to those for BSTs except:
   // 1. they only ever add AVLNodes
   // 2. they finish by rebalancing at the node that was changed
   
   public void addRoot(K data) throws Exception {
      if (root != null)
         throw new Exception("The Tree is not empty");
      root = new AVLNode<K>(null, null, null, data);
      size++;
   }

   public void addLeft(AVLNode<K> node, K data) throws Exception {
      if (node.getLeft() != null)
         throw new Exception("Attempt to replace existing node.");
      node.setLeft(new AVLNode<K>(node, null, null, data));
      size++;
      rebalance(node);  // to deal with potential balance problems above the node
   }

   public void addRight(AVLNode<K> node, K data) throws Exception {
      if (node.getRight() != null)
         throw new Exception("Attempt to replace existing node.");
      node.setRight(new AVLNode<K>(node, null, null, data));
      size++;
      rebalance(node);
   }

   public void remove(K data) throws Exception {
      AVLNode<K> target = findNode(data);
      if (target == null || !target.getData().equals(data)) 
         throw new Exception("Target data not found");
      AVLNode<K> parent = (AVLNode<K>) removeNode(target);        // parent has just lost a node, so rebalance
      rebalance(parent);
   }

   // the important methods to rebalance and rebuild in an AVL tree
   // decide whether and which rotation can fix balance at node and then recursively rebalance parent if needed
   public void rebalance(AVLNode<K> node) {
      if (node == null) return;
      int oldMaxHt = AVLNode.max(node.leftChildHt, node.rightChildHt);
      int newMaxHt = node.fixHt();
      if (newMaxHt > node.leftChildHt + 1 || newMaxHt > node.rightChildHt + 1) {  // rotation required
         AVLNode<K> leftChild = (AVLNode<K>) node.getLeft();
         AVLNode<K> rightChild = (AVLNode<K>) node.getRight();
         if (node.leftChildHt > node.rightChildHt && 
               leftChild.leftChildHt >= leftChild.rightChildHt) // single rotate at left
            rebuildNode(node, leftChild, (AVLNode<K>) leftChild.getLeft(), node, 
                  (AVLNode<K>) leftChild.getLeft().getLeft(), (AVLNode<K>) leftChild.getLeft().getRight(), 
                  (AVLNode<K>) leftChild.getRight(), rightChild);
         else if (node.leftChildHt > node.rightChildHt) // double rotate at left
            rebuildNode(node, (AVLNode<K>) leftChild.getRight(), leftChild, node, 
                  (AVLNode<K>) leftChild.getLeft(), (AVLNode<K>) leftChild.getRight().getLeft(), 
                  (AVLNode<K>) leftChild.getRight().getRight(), rightChild);
         else if (rightChild.rightChildHt >= rightChild.leftChildHt) // single rotate at right
            rebuildNode(node, rightChild, node, (AVLNode<K>) rightChild.getRight(), 
                  leftChild, (AVLNode<K>) rightChild.getLeft(), 
                  (AVLNode<K>) rightChild.getRight().getLeft(), (AVLNode<K>) rightChild.getRight().getRight());
         else   // double rotate at right
            rebuildNode(node, (AVLNode<K>) rightChild.getLeft(), node, rightChild, 
                  leftChild, (AVLNode<K>) rightChild.getLeft().getLeft(), 
                  (AVLNode<K>) rightChild.getLeft().getRight(), (AVLNode<K>) rightChild.getRight());
      }
      newMaxHt = node.fixHt();
      if (oldMaxHt != newMaxHt) rebalance((AVLNode<K>) node.getParent());
   }

   // node is rebuilt so that its data and child data is from putTop, putLeft, putRight
   // and the 4 subtrees under its children are subTree1 ... subTree4 in order.
   // this one function can carry out both single and double rotations
   public void rebuildNode(AVLNode<K> node, AVLNode<K> putTop, AVLNode<K> putLeft, AVLNode<K> putRight,
         AVLNode<K> subTree1, AVLNode<K> subTree2, AVLNode<K> subTree3, AVLNode<K> subTree4) {
      AVLNode<K> newLeft = new AVLNode<K>(node, subTree1, subTree2, putLeft.getData());
      AVLNode<K> newRight = new AVLNode<K>(node, subTree3, subTree4, putRight.getData());
      if (subTree1 != null) subTree1.setParent(newLeft);
      if (subTree2 != null) subTree2.setParent(newLeft);
      if (subTree3 != null) subTree3.setParent(newRight);
      if (subTree4 != null) subTree4.setParent(newRight);
      newLeft.fixHt();
      newRight.fixHt();
      node.setData(putTop.getData());
      node.setLeft(newLeft);
      node.setRight(newRight);
   }
   
   // The following method are identical to those in BST --- this part of the code could
   // have been completely omitted by coding AVLTree as a subclass of BST
   
   public AVLNode<K> findNode(K target) {
      if (root() == null)
         return null;
      return recursiveFindNode((AVLNode<K>) root(), target);
   }

   // either find the node containing target or the future parent of a Node that would contain target
   protected AVLNode<K> recursiveFindNode(AVLNode<K> node, K target) {
      int comparison = target.compareTo(node.getData());
      if (comparison == 0) return node;
      if (comparison < 0 && node.getLeft() != null) 
         return recursiveFindNode((AVLNode<K>) node.getLeft(), target);
      if (comparison > 0 && node.getRight() != null) 
         return recursiveFindNode((AVLNode<K>) node.getRight(), target);
      return node;
   }

   public void add(K newData) throws Exception {
      AVLNode<K> node = findNode(newData);
      if (node == null)
         addRoot(newData);
      else if ((node.getData()).compareTo(newData) > 0)
         addLeft(node, newData);
      else if ((node.getData()).compareTo(newData) < 0)
         addRight(node, newData);
      else node.setData(newData);
   }

   public boolean contains(K target) {
      AVLNode<K> node = findNode(target);
      if (node == null || !node.getData().equals(target))
         return false;
      return true;
   }

   public boolean isEmpty() {
      return root == null;
   }

   public K get(K partialData) {
      AVLNode<K> node = findNode(partialData);
      if (node == null || !node.getData().equals(partialData))
         return null;
      return node.getData();
   }

   public Iterator<K> iterator() {
      ArrayList<TNode> list = inOrder();
      ArrayList<K> dataList = new ArrayList<K>();
      for (TNode node: list) dataList.add(((AVLNode<K>) node).getData());
      return dataList.iterator();
   }

   public void dumpData() {
      System.out.println(treePrint(null));
   }

   @Override  // when removing from a BST or AVLTree, we can only promote from a neighbor in order
   protected BinaryNode descendant(BinaryNode node) {
      BinaryNode lower = node.getLeft();
      if (lower != null) {
         while (lower.getRight() != null) lower = lower.getRight();
         return lower;    // immediate predecessor of node (in order)
      }
      lower = node.getRight();
      if (lower != null) {
         while (lower.getLeft() != null) lower = lower.getLeft();
         return lower;   // immediate successor of node (in order)
      }
      return null;
   }
}
