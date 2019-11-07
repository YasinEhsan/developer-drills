// BFS Iterative (back to back swe)
class Node{
        int x;
        List<Node> adj = new ArrayList<>();
    }

    /*plan
        - use queue
        - store visited nodes in hashset
        - loop while stack contains
            - poll queue and save to cur
            - if curr is not in visted add it print it
            - loop thru adjecy matrix
            - if not visited add it to stack
     */
    public void bfsPrint(Node start){
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

// BFS RECURSIVE
public class Graph {
    int V;
    LinkedList<Integer> adjList[];

    public Graph(int v){
        V = v;
        adjList = new LinkedList[v];
        for(Object e: adjList)
            e = new LinkedList<>();
;        }

    public void addEdge(int v, int w){
        adjList[v].add(w);
    }
}

public void bfsRecursive(Graph graph){
    Queue<Integer> queue = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();

    for(int i = 0; i < graph.V; i++){
        if(!visited.contains(i)){
            getConnectedComponents(graph, visited, i, queue);
        }
    }

    while (!queue.isEmpty())
        System.out.println(queue.poll());
}

public void getConnectedComponents(Graph graph, Set<Integer> visited, int vertex, Queue<Integer> queue){
    visited.add(vertex);
    for(Integer neighbor: graph.adjList[vertex]){
        if(!visited.contains(neighbor))
            getConnectedComponents(graph, visited, neighbor, queue);
    }
    queue.add(vertex);
}
