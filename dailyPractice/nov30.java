package com.yasinehsan.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Main {

    public class Node{
        int val;
        Node left, right;

        List<Node> adjList;
    }

    public void dfs(Node start){
        Stack<Node> stack = new Stack<>();
        HashSet<Integer> visited = new HashSet<>(); // asuume each node.val is unique
        stack.push(start);

        while (!stack.isEmpty()){
            Node curr = stack.pop();

            if(!visited.contains(curr.val))
                visited.add(curr.val);

            for(int neighbor = 0; neighbor < curr.adjList.size(); neighbor++){
                if(!visited.contains(curr.adjList.get(neighbor).val))
                stack.push(curr.adjList.get(neighbor));
            }
        }
    }

    public int dfs2(List<Integer>[] adjList){//asume the adjList is self genrated with node 0-x. perhaps a hashmap connected the nodes w actual node i.e node 3 is node for location germany.
        HashSet<Integer> visited = new HashSet<>();
        int count = 0;

        for(int vertex = 0; vertex < adjList.length; vertex++){
            if(!visited.contains(vertex)){
                count++;
                ArrayList<Integer> connected = new ArrayList<>();
                getConnectedComponents(vertex, adjList, visited, connected);
                System.out.println(connected);
            }
        }

        return count;
    }

    private void getConnectedComponents(int v, List<Integer>[] adjList, HashSet<Integer> visited, ArrayList<Integer> connected){
        visited.add(v);
        connected.add(v);

        for(int neighbor = 0; neighbor < adjList[v].size(); neighbor++){
            if(!visited.contains(neighbor))
                getConnectedComponents(neighbor, adjList, visited, connected);
        }
    }







    public static void main(String[] args){
        System.out.println("printing 123");

        int[] arr = {1,2,3,4,5,100,111};

    }
}
