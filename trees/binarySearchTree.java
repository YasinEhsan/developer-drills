public class Node{
        int val;
        Node left, right;

        public Node(int val){
            this.val = val;
        }
    }

public boolean search2(Node root, int key){
        if(root == null) return false;
        else if(root.val == key) return true;

        if(root.val < key)
            return search2(root.right, key);
        return search2(root.left, key);
    }


    public void insert2(Node root, int given){
        if(root == null){
            root = new Node(given);
            return;
        }

        if(root.val < given)
            insert2(root.right, given);
        else
            insert2(root.left, given);
    }
