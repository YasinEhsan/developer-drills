

public class Graph{
    int V;
    LinkedList<Integer> adjList[];

    public Graph(int v){
        V = v;
        adjList = new LinkedList[v];
        for(Object e: adjList)
            e = new LinkedList<>();
    }

    public void addEdge(int v, int w){
        adjList[v].add(w);
    }
}

/* plan
    - topSort is very simmilar to recursive dfs
    - instead of having a component array as in my dfs recursive we have stack
    - in the util we add thre vertex to stack
    - in main method we return stack or pop it

    - create set for seen. we can make it integers hoping it won't repeat
    - loop thru each vertex and call util method if not in set
    - in util add to set and loop thru each neighbor
        - if not in set then call the util (vertex, visited, adjList)
        - push to stack at end of util
 */

public void topSort(Graph graph){
    Stack<Integer> stack = new Stack<>();
    Set<Integer> visited = new HashSet<>();

    for(int vertex = 0; vertex < graph.V; vertex++){
        //graph.adjList[vertex] is a linkedlist w first position being the vertex
        //also assuming graph w vertices of random numbers i.e. 67 923 98
        //if vertexs of graph are nice ordered like 0,1,2,3 visted.contains(vertex)
        if(!visited.contains(graph.adjList[vertex].getFirst())){
            topSortUtil(stack, vertex, visited, graph);
        }
    }

    while (!stack.isEmpty())
        System.out.println(stack.pop());
}

private void topSortUtil(Stack<Integer> stack, int vertex, Set<Integer> visited, Graph graph){
    visited.add(vertex);
    for(Integer neighbor: graph.adjList[vertex]){
        if(!(visited.contains(neighbor)))
            topSortUtil(stack, vertex, visited, graph);
    }
    stack.push(vertex);
}


// https://www.geeksforgeeks.org/topological-sorting/
