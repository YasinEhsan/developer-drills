//RECURSIVE
// Encodes a tree to a single string.
 public String serialize(TreeNode root) {
     return helperS(root, "");
 }

 private String helperS(TreeNode root, String s){
     if(root == null){
         s += "null,";
     }
     else{
         s += root.val + ",";
         s = helperS(root.left, s);
          s = helperS(root.right, s);
     }
     return s;
 }

 // Decodes your encoded data to tree.
 public TreeNode deserialize(String data) {
     Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));
     return helperD(q);
 }

 private TreeNode helperD(Queue<String> list){
     String curr = list.poll();
     if(curr.equals("null")) return null;
     TreeNode node = new TreeNode(Integer.valueOf(curr));
     node.left = helperD(list);
     node.right = helperD(list);
     return node;
 }
