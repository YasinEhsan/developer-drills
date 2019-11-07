//DFS RECURSIVE (pathrise implementation)
public class Node{
        int value;
        LinkedList<Node> neighbors;

        public Node(int n){
            this.value = n;
            neighbors = new LinkedList<>();
        }
    }


    /* plan
           - goal is to go thru each vertex in the graph and the graph can have a few connected components
           - store visited nodes in a hashset
           - loop each node in adj
           - call helper method to find the connected compinent at each node which returns a list of vertices
           - print those components
        */
    public void dfs(LinkedList<Node>[] adjList){
        Set<Integer> visited = new HashSet<>();

        for(LinkedList<Node> node: adjList){
            Node curr = node.getFirst();
            if(!visited.contains(curr)){
                ArrayList<Integer> components = new ArrayList<>();
                components = getConnectedComponets(curr, visited, components);
                System.out.printf("do something %s", components.toString());
            }
        }
    }

    public ArrayList<Integer> getConnectedComponets(Node curr, Set<Integer> visited, ArrayList<Integer> components){
        visited.add(curr.value);
        components.add(curr.value);
        for(Node connected : curr.neighbors){
            if(!visited.contains(connected)){
                getConnectedComponets(connected, visited, components);
            }
        }
        return components;
    }



//DFS ITERATIVE (back to back swe)
class Node{
        int x;
        List<Node> adj = new ArrayList<>();
    }

    /*plan
        - use cal stack or create a stack
        - store visited nodes in hashset
        - loop while stack contains
            - pop stack and save to cur
            - if curr is not in visted add it print it
            - loop thru adjecy matrix
            - if not visited add it to stack
     */
    public void dfsPrint(Node start){
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>(); //we can use integer for better space

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
