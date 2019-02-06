package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Following is BFS and DFS starting from vertex 2");
	 Graph graph=new Graph(4);
	 graph.addEdge(0,1);
	 graph.addEdge(0,2);
	 graph.addEdge(1,2);
	 graph.addEdge(2,0);
	 graph.addEdge(2,3);
	 graph.addEdge(3,3);
        System.out.println("Following is BFS starting from vertex 2");
	 graph.BFSearch(2);//Starting vertex is 2
        System.out.println("Following is  DFS starting from vertex 2");
         graph.DFS(2);
    }
}
