//RECURSIVE
public void inOrder(Node root){
      if(root == null) return;
      inOrder(root.left);
      //do something w root
      inOrder(root.right);
  }
