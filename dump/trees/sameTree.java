/**
- leetcode no. 100
- iterative sol is 100% faster and 100% less memory on leet
- my leetcode post : https://leetcode.com/problems/same-tree/discuss/464573/1ms-34.3-mb-%3A-100-faster-and-100-less-memory-than-all-java-submissions

**/

//ITERATIVE
public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> pOrder = postOrder(p);
        Stack<TreeNode> qOrder = postOrder(q);

         if(pOrder.size() != qOrder.size()) return false;

         Iterator<TreeNode> iterator = pOrder.iterator();
         Iterator<TreeNode> iterator2 = qOrder.iterator();
         while(iterator.hasNext()){
             TreeNode pn = iterator.next();
             TreeNode qn = iterator2.next();
             if((pn == null && qn != null) ||
                (qn == null && pn != null) ||
                ((pn != null && qn != null) &&
                pn.val != qn.val))
                 return false;
         }
         return true;
     }

     public Stack<TreeNode> postOrder(TreeNode root){
         Stack<TreeNode> stack1 = new Stack<>(),
         stack2 = new Stack<>();
         stack1.push(root);

         while(!stack1.isEmpty()){
             TreeNode curr = stack1.pop();
             stack2.push(curr);

             if(curr != null) {
             stack1.push(curr.right);
              stack1.push(curr.left);
             }
         }
         return stack2;
     }


  //RECURSIVE
  public boolean isSameTree(TreeNode p, TreeNode q) {
       if(p == null || q == null) return p == q;
       return p.val == q.val &&
           isSameTree(p.right, q.right) &&
           isSameTree(p.left, q.left);
   }
}
/**
  - there are 5 cases: both null, one null (x2), both val same, both val diff
  - the first if takes care of all null cases neatly in one line
**/
