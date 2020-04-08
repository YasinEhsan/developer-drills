//RECURSIVE n + (n-1) + (n-2)... n^2 no space
    public void printLevelOrder(Node root){
        int height = height(root);

        for(int i = 0; i <= height; i++){
            printGivenLevel(root, i);
        }
    }

    public int height(Node root){
        if(root == null) return 0;
        else {
            //cpompare left subtree w right subtree
            if(height(root.left) > height(root.right)){
                return height(root.left) + 1;
            }
            else
                return height(root.right) + 1;
        }
    }

    public void printGivenLevel(Node root, int level){
        if(root == null){
            return;
        }
        if(level == 1){
            //do something w root
        }
        else {
            printGivenLevel(root.left, level -1);
            printGivenLevel(root.right, level -1);
        }
    }

    //ITERATIVE one pass n space
    public void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node curr = queue.poll();
            //do soemthing w root

            if(curr.left != null){
                queue.add(curr.left);
            }
            if(curr.right != null){
                queue.add(curr.right);
            }
        }
    }

    //RECURSIVE using hash one pass n space
    public void lvlOrder(Node root, int level, Map<Integer,List<Integer>> map){
        if(root == null) return;
        if(!map.containsKey(level)){
            map.put(level, new ArrayList<>());
        }
        map.get(level).add(root.val);
        lvlOrder(root.left, level +1, map);
        lvlOrder(root.right, level +1, map);
    }

//https://www.techiedelight.com/level-order-traversal-binary-tree/
