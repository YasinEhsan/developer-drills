//ITERATIVE
public void preOrder(Node root){
        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node curr = stack.pop();
            //do something w root

            if(curr.right == null)
                stack.push(curr.right);
                
            if(curr.left == null)
                stack.push(curr.left);
        }
    }


//RECURSIVE
public void preOrder(Node root){
      if(root == null) return;
      //do something w root
      preOrder(root.left);
      preOrder(root.right);
  }

/* links
https://www.techiedelight.com/preorder-tree-traversal-iterative-recursive/

*/
