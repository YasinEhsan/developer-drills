# Graphs
Problems and notes on sub-topic graphs.

## Basics
- Graphs can be represented using objects an pointers(node/vertex), edge list, adjacency list, adjacency matrix, incidence matrix, incidence list or adjacency sets
- Commonly used are **adjacency matrix** and **adjacency list**
- Each graph problem is some version of a DFS / BFS traversal

Action | Adjacency Matrix | Adjacency List
---| --- | ---
Find connected vertices | O(V) | O(E)
Find two vertices are connected | O(1) | O(E)
Memory usage | O(V^2) | O(V + E)


Depth First Search | Breadth First Search
--- | ---
Pre-order tree traversal | level order tree traversal
Stack (LIFO)| Queue (FIFO)
Backtracking | Visited storage hash/matrix
one child pointer | k child pointers
less space | more space
O(vertices)/O(depth) | O(vertices)/O(vertices)

Prim's Algorithm | Dijkstra's Algorithm
--- | ---
Finds minimum spanning tree (MST) | Finds shortest path tree (SPT)
Works only for undirected graphs | Works for both
Can handle negative edge costs | Cannot
path links all vertices | path from source to destination vertex
think least electricity | think least amount of GPS travel

- A SPT of a graph with weights = 1 is same as BFS path of the graph
- Dijkstra's algorithm doesn't create a MST, it finds the shortest path.
```Java
     5     5
s *-----*-----* t
     \         /
       -------
          9
```
- **The shortest path is 9, while the MST is a different 'path' at 10.**


## Questions
1. If bfs/dfs is iteratively traversed will it find all vertices in a disjoint graph?
  + if given a node as param then you can find all paths connected to that nodes. you can only do that. i.e. only that disjoint part.
  + if given adjList or graph then you can use recursion over each vertex. Is it possible to iteratively traverse graph given adjList?

## Snippets
```java
//Graph  using adjacency list
public class Graph{
        int V;
        LinkedList<Integer> adj[];

        public Graph(int v){
            V = v;
            adj = new LinkedList[v];
            for(Object e: adj)
                e = new LinkedList<>();
        }

        public void addEdge(int v, int w){
            adj[v].add(w);
        }
    }

```

## Definitions
- **Directed acyclic graph (D.A.G.)** intuitive use topological sort
- **Spanning Tree** path of a non-disjoint graph that connects all vertices
- **Minimum spanning tree** : connect all vertices with the least amount of total weight. Use Prims or Kruskal's Alg.
- **Complete Graph** each vertex is connected to all the other vertices


## Links
- [Pathrise Framework](https://fellows.pathrise.com/knowledge/workshops/graph-fundamentals)
- [GeeksforGeeks graph representations](https://www.geeksforgeeks.org/graph-and-its-representations/)
- [back to back swe dfs](https://www.youtube.com/watch?v=TIbUeeksXcI)
<!-- - [] -->
