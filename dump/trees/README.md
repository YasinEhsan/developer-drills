# Trees
Notes on subtopic trees.

## Basics
- Tree traversal sequence visual. N(print) pos based on seq. Fill in L / R
  + preorder  **N** L R
  + inorder   L **N** R
  + postorder L R **N**
- level order is finding adj vertex from current vertex first. many permutations. can use bfs with parameter as starting node or root.
- DFS : pre/in/post- orders BFS is level order
- whenever hear subtree err to **postorder** nlr bc. you need left and right first (80%)
- all DFS traversals are bottom-up recursion
- for graphs/tree questions bring up bfs dfs and costs for each + bottom-up vs top-down
- BST > Hashing
  + inOrder() traversal BST keys are sorted
  + BST is customized where hash the library does the hashing
  + insert delete search log(n) always for self-balancing BST hash is O(1) average time

## Questions
1. For dfs traversals does left/right right/left matter? esp w pre/post-order?

## Snippets
```java
public class Node {
        int val;
        Node right, left;
        public Node(int val, Node right, Node left){
            this.val = val;
            this.right = right;
            this.left = left;
        }
        public Node(int val){
            this.val = val;
            right = left = null;
        }
        //setters getters
    }

    public class BinaryTree {
        Node root;
        public BinaryTree(int x){
            root = new Node(x);
        }
        public BinaryTree(){
            root = null;
        }
    }
```
## Definitions / Jargon
- subtree, child nodes, leaves, root, height, depth

## Links
- [techiedelight](https://www.techiedelight.com/preorder-tree-traversal-iterative-recursive/)
- [pathrise binary trees](https://fellows.pathrise.com/knowledge/workshops/binary-trees-technical-workshop)
