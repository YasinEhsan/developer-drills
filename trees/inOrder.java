//ITERATIVE
public void inOrder(Node root){
    Stack<Node> stack = new Stack<>();
    Node curr = root;

    while (!stack.isEmpty() || curr != null){
        if(curr == null){
            stack.push(curr);
            curr = curr.left;
        }
        else {
            stack.pop();
            //do something
            curr = curr.right;
        }
    }
}





//RECURSIVE
public void inOrder(Node root){
      if(root == null) return;
      inOrder(root.left);
      //do something w root
      inOrder(root.right);
}

/*Links
- https://www.techiedelight.com/inorder-tree-traversal-iterative-recursive/

*/
