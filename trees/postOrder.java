//RECURSIVE
public void postOrder(Node root){
      if(root == null) return;
      preOrder(root.left);
      preOrder(root.right);
      //do something w root
  }
