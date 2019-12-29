// Leetcode 104 ez

//ITERATIVE
public int maxDepth(TreeNode root) {
      if(root == null)
          return 0;
      Stack<TreeNode> stack = new Stack<>();
      Stack<Integer> val = new Stack<>();

      int max = 0;
      stack.push(root);
      val.push(1);

      while(!stack.isEmpty()){
          TreeNode curr = stack.pop();
          int temp = val.pop();
          max = Math.max(temp, max);

         if(curr.right != null){
             stack.push(curr.right);
             val.push(temp+1);
         }


          if(curr.left != null){
               stack.push(curr.left);
              val.push(temp+1);
          }


      }

      return max;




  }


//RECURSIVE w null chk (faster than 100% of submissions)
public int maxDepth(TreeNode root) {
     if(root == null) return 0;
     int leftSide = root.left == null ? 0 : maxDepth(root.left),  rightSide = root.right == null ? 0 : maxDepth(root.right);
     return 1+ Math.max(leftSide, rightSide);
 }
