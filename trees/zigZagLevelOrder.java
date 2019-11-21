/* OPTIONS for zig zag
       - method 1: use hashmap itertive to get level then loop evrey other val reversely
       - method 2: recursively level order and at each level we switch print with boolean
       - method 3: two stack one pass


       METHOD 3
       - have two stack push root into s1
       - outer wile loop runs whens either stack contains something
       - inner s1 stack imitates bfs and then pushs left right to s2
       - inner s2 vice versa
    */



   public void zigZag(Node root){
       Stack<Node> s1 = new Stack<>();
       Stack<Node> s2 = new Stack<>();


   }
