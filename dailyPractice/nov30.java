package com.yasinehsan.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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

    public void preOrder(Node root){
        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node curr = stack.pop();
            //print curr

            if(curr.right != null)
                stack.push(curr.right);
            if(curr.left != null)
                stack.push(curr.left);
        }
    }

    public void inOrder(Node root){
        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (!stack.isEmpty() || curr != null) {
            if (curr == null) { //hAs to be null
                stack.push(curr);
                curr = curr.left;
            }
            else {
                Node n = stack.pop();
                //print node
                curr = curr.right;
            }
        }

    }

    public void postOrder(Node root){
        Stack<Node> stack1 = new Stack<>(), stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()){
            Node curr = stack1.pop();
            stack2.add(curr);

            if(curr.left != null)
                stack1.add(curr.left);
            if(curr.right != null)
                stack1.add(curr.right);
        }

        Iterator<Node> loop = stack2.iterator();

        while (loop.hasNext())
            System.out.println(loop.next().val);

        //same?
        for(Node n : stack2)
            System.out.println(n);
    }

    /*thoughts
        - rename repo to dev drills
        - technical daily game plan do revise and then new topic (make it ez) then recent intv
        - long term plan expose to very common topics do problems for each subtopic when done than redo process for common topics and then smaller topics. time prsctioce is key
        - also somedays i have to practive w real life peopel like thru pathrise or matthew
     */





    public static void main(String[] args){
        System.out.println("printing 123");

        int[] arr = {1,2,3,4,5,100,111};

    }
}
