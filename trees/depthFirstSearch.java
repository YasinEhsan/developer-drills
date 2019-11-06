// https://www.youtube.com/watch?v=TIbUeeksXcI


class Node{
        int x;
        List<Node> adj = new ArrayList<>();
    }

    public void dfsPrint(Node start){
        /*plan
            - use cal stack or create a stack
            - store visited nodes in hashset
            - loop while stack contains
                - pop stack and save to cur
                - if curr is not in visted add it print it
                - loop thru adjecy matrix
                - if not visited add it to stack
         */

        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>();

        stack.push(start);
        while (!stack.isEmpty()){
            Node curr = stack.pop();
            if(!visited.contains(curr)){
                visited.add(curr);
                //do something
            }
            for(Node n: curr.adj){
                if(!visited.contains(n)){
                    stack.push(n);
                }
            }
        }
      }
