//RECURSIVE
public void inOrder(Node root){
      if(root == null) return;
      preOrder(root.left);
      //do something w root
      preOrder(root.right);
  }
