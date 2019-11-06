// https://www.youtube.com/watch?v=TIbUeeksXcI

class Node{
        int x;
        List<Node> adj = new ArrayList<>();
    }

    public void bfsPrint(Node start){
        /*plan
            - use queue
            - store visited nodes in hashset
            - loop while stack contains
                - poll queue and save to cur
                - if curr is not in visted add it print it
                - loop thru adjecy matrix
                - if not visited add it to stack
         */

        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        queue.add(start);

        while (!queue.isEmpty()){
            Node curr = queue.poll();
            if(!visited.contains(curr)){
                visited.add(curr);
                //do something
            }

            for(Node adjacent : curr.adj){
                if(!visited.contains(adjacent)){
                    queue.add(adjacent);
                }
            }
        }
    }
