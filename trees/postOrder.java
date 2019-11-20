//ITERATIVE
public void postOrder(Node root){
        Stack<Node> stack = new Stack<>(), out = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node curr = stack.pop();
            out.push(curr);

            if(curr.left == null)
                stack.push(curr.left);

            if(curr.right == null)
                stack.push(curr.right);

        }

        Iterator<Node> iterator = out.iterator();
        while(iterator.hasNext()){
            Node n = iterator.next();
            //do something
        }
    }
S


//RECURSIVE
public void postOrder(Node root){
      if(root == null) return;
      preOrder(root.left);
      preOrder(root.right);
      //do something w root
  }

/*Links
- https://www.techiedelight.com/postorder-tree-traversal-iterative-recursive/

*/
