//     * Definition for a binary tree node.
    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        /*Plan
            - recurse we need base case if node is null
            - pre order traversal will be NLR print left right
            - however we are appending to a string thus we need left and right first
            - when we return we return like root.val + left + right
            - we need a way to keep track of sperate chracters like commas
         */

        if(root == null)
            return "NULL,";

        String leftNode = serialize(root.left);
        String rightNode = serialize(root.right);
        return root.val + "," + leftNode + rightNode;

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        /*Plan
            - we need to store the values of treenode that we can acesss queue works
            - so lets store the values of string seprated by comma into queue
            - we can use a helper function to to the meat of deserilize
            - the helper fuction takes in a queue if node is "null" returns null
            - elif creats a new tree node with that val
            - then calls deserialize on left tree node and right trre node
            - lastly returns root
         */

        Queue<String> nodeFile = new LinkedList<>();
        nodeFile.addAll(Arrays.asList(data.split(",")));
        return helper(nodeFile);
    }

    private TreeNode helper(Queue<String> nodeFile){
        String parsed = nodeFile.poll();
        if(parsed.equals("NULL"))
            return null;
        TreeNode currNode = new TreeNode(Integer.valueOf(parsed));
        currNode.left = helper(nodeFile);
        currNode.right = helper(nodeFile);
        return currNode;

    }
