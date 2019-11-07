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


## Questions
1. If bfs/dfs if iteratively traversed will it find all vertices in a disjoint graph?
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
- **Minimum spanning tree** : connect all vertices with the least amount of total weight. Use Prims or Kruskal's Alg.
- **Complete Graph** each vertex is connected to all the other vertices


## Links
- [Pathrise Framework](https://fellows.pathrise.com/knowledge/workshops/graph-fundamentals)
- [GeeksforGeeks graph representations](https://www.geeksforgeeks.org/graph-and-its-representations/)
- [back to back swe dfs](https://www.youtube.com/watch?v=TIbUeeksXcI)
<!-- - [] -->
