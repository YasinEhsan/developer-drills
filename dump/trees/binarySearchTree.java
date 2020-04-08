public class Node{
    int val;
    Node left, right;

    public Node(int val){
        this.val = val;
    }
}
//
//    /*PLAN for delete node n
//        - Case 1: n is a leaf (bottom)
//        - Case 2: n has one child
//        - Case 3: n has two child
//
//     */
public Node delete(Node root, int rmKey){
    if(root == null){
        return root;
    }

    if(root.val < rmKey)
        delete(root.right, rmKey);
    else if(root.val > rmKey)
        delete(root.left, rmKey);
    else {
        if(root.left == null)
            return root.right;
        else if(root.right == null)
            return root.left;

        root.val = minValue(root.right);
        root.right = delete(root.right, root.val);
    }
    return root;
}

private int minValue(Node root){
    int minV = 0;
    while(root.left != null){
        minV = root.left.val;
        root = root.left;
    }
    return minV;
}

public Node insert(Node root, int key){
    if(root == null){
        root = new Node(key);
        return root;
    }

    if(root.val < key)
        insert(root.right, key);
    else if(root.val > key)
        insert(root.left, key);
    return root;
}


public boolean search2(Node root, int key){
        if(root == null) return false;
        else if(root.val == key) return true;

        if(root.val < key)
            return search2(root.right, key);
        return search2(root.left, key);
    }
