//RECURSIVE
public boolean isSubtree(TreeNode s, TreeNode t) {
       return serialize(s).contains(serialize(t)); // Java use naive solution that cause O(M*N). Replace with KMP algorithm to ensure O(M+N)
   }

   private String serialize(TreeNode root) {
       StringBuilder builder = new StringBuilder();
       serialize(root, builder);
       return builder.toString();
   }

   private void serialize(TreeNode root, StringBuilder builder) {
       if (root == null) {
           builder.append(",#");
       } else {
           builder.append("," + root.val);
           serialize(root.left, builder);
           serialize(root.right, builder);
       }
   }
