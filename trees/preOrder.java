//RECURSIVE
public void postOrder(Node root){
      if(root == null) return;
      //do something w root
      preOrder(root.left);
      preOrder(root.right);
  }
