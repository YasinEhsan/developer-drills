# graphs
Problems and notes on sub-topic graphs.

## basics
- the adjacency list of a graph can be represented using an adjacency list, adjacency matrix, incidence matrix, incidence list and adjacency sets
- each have its pros and cons and used relative to problem. Commonly used are **adjacency matrix** and **adjacency list**



## snippets
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

## definitions
- **Directed acyclic graph (D.A.G.)** intuitive use topological sort
- **Minimum spanning tree** : connect all vertices with the least amount of total weight. Use Prims or Kruskal's Alg.
- **Complete Graph** each vertex is connected to all the other vertices


## links
- [Pathrise Framework](https://fellows.pathrise.com/knowledge/workshops/graph-fundamentals)
- [GeeksforGeeks graph representations](https://www.geeksforgeeks.org/graph-and-its-representations/)
