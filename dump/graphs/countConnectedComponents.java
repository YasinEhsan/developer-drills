//RECURSIVE DFS ON 2D MATRIX

/* PLAN
    Why use 2d matrix: because we can store / track
        - connected components
        - direction
        - weights

    Given a list of nodes that are connected and their respective weights
        - i.e. {{a,b} {b,c}} and {2,3} so a->b with edge weight 2

    I want to possibly do the following
        1. create a 2d matrix that maps vertices to numbers which would be index of my 2d array
        2. call dfs of get # of connected components
        3. create neighbors list to iterate the positions of 8 clockwise neighbors
        4. create pursurePath to see if each adjacent search is bounds 6 criteria
        5. find path between two vertices

 */

/*plan
    - to track visited nodes
        - hash set if weights values are not repeating
        - boolean [][] if values / weights are repeating (more common i.e. island problem)
    - if we are given just the nodes in and array and their respective weights in another...we have to construct the 2d matrix first.
    - for each row,col call connectedComopented method

    CONNECTED COMPONENTS (row, col, matrix)
    - set visited to true
    - store the 8 clockwise positions of the current node in a positions array
    - call recursively for all 8 adj nodes clockwise: up, up-right, right, down-right, down, down-left, left, up-left
    - before we call dfs we have to check is we are in bounds and if the node is part of connected componented and has not been visited yet
 */


public int countComponents(int adjMatrix[][]){
    boolean[][] visited = new boolean[adjMatrix.length][adjMatrix.length];
    int count = 0;

    for(int row = 0; row < adjMatrix.length; row++){
        for(int col = 0; col < adjMatrix.length; col ++){
            if(!visited[row][col]){
                getConnectedComponent(adjMatrix, row, col, visited);
                count++;
            }
        }
    }
    return count;
}

private void getConnectedComponent(int adjMatrix[][], int row, int col, boolean[][] visited){
    int [][] adjPos = { {-1, -1}, {-1, 0}, {-1, 1},
                            {0, -1},            {0, 1},
                            {1, -1},  {1, 0},  {1, 1} };//adj[8][1] returns bottom-right

    visited[row][col] = true;

    for(int[] pos: adjPos){
        int adjRow = row + pos[0];
        int adjCol = col + pos[1];
        if(pursuePath(adjMatrix, adjRow, adjCol, visited))
            getConnectedComponent(adjMatrix, adjRow, adjCol, visited);
    }




}

private boolean pursuePath(int[][] adjMatrix, int row, int col, boolean[][] visited){
    return row >= 0 &&
            row < adjMatrix.length &&
            col >= 0 &&
            col < adjMatrix.length &&
            !visited[row][col] &&
            adjMatrix[row][col] == 1; //last condition checks for barriers
}

//https://www.geeksforgeeks.org/find-number-of-islands/
