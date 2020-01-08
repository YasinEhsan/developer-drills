//leet 206

//RECURSIVE
PUlic TreeNode invertTree(TreeNode root) {
    if(root == null)
        return null;

    TreeNode right = invertTree(root.right);
    TreeNode left = invertTree(root.left);
    root.left = right;
    root.right = left;

    return root;
}

//ITERATIVE
public TreeNode invertTree(TreeNode root) {
       if(root == null) return null;
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);

       while(!q.isEmpty()){
           TreeNode curr = q.poll();
           TreeNode temp = curr.right;
           curr.right = curr.left;
           curr.left = temp;
           if(curr.right != null) q.add(curr.right);
           if(curr.left != null) q.add(curr.left);
       }
       return root;
   }
