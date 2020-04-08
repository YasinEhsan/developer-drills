// DIJKSTRAS ALG USING 2D ADJ MATRIX FROM SATRTING NODE


/*plan
        - given a 2d matrix graph and source vertex
        - we create a set visted, distances array, and parent array to find shoterst path
        - we set each value in distnces to integer max or infinitti and d[src] = 0
        - we loop while set is not the same as grapgh lenth
        - we add vertice u = minDistance(set, ditancee) to set
            - mindistances is helper meothed returns the index of wsamllest in distances array
        - we loop thru all vertices v that are connected to u
        - if d[u] + graph[u][v] > d[v]
            - d[v] = d[u] + graph[u][v]
     */
    public void dijkstras(int[][] graph, int src){
        int distances[] = new int[graph.length], parent[] = new int[graph.length];
        Set<Integer> visited = new HashSet<>();

        Arrays.fill(distances, Integer.MAX_VALUE);
        Arrays.fill(parent,-1); //parent[u] = the shortest path connection for that vertex
        distances[src] = 0;

        while (visited.size() != graph.length){
            int u = minDistances(visited, distances);
            visited.add(u);

            for(int v = 0; v < graph[u].length; v++){
                if(!visited.contains(v) && distances[u] + graph[u][v] < distances[v]){
                    distances[v] = distances[u] + graph[u][v];
                    parent[v] = u;
                }
            }
        }
    }

    private int minDistances(Set<Integer> visited, int[] distances){
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;

        //find smallest val in distances
        for(int i = 0; i < distances.length; i++){
            if(!visited.contains(distances[i]) && distances[i] < minValue){
                minValue = distances[i];
                minIndex = i;
            }
        }
        return minValue;
    }

/*FUTURE ITERATION
  - find how to fidn the shortest path between two nodes
  - find the shortest path from each vertex in graph

  CLUTCH EXPLINATIONS
  - gurav sen https://www.youtube.com/watch?v=d6ZFqjH63vo
  - gfg https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/
  - back to back swe https://backtobackswe.com/videos/dijkstras-algorithm-vs-prims-algorithm
  - abdul bari https://www.youtube.com/watch?v=XB4MIexjvY0
*/
