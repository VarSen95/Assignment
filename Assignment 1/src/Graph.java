package com.company;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    private int V;  //Number of vertices
    private LinkedList<Integer>  adj[];   //Array of lists that will contain list of adjacent vertices

    public Graph(int v)
    {
        V=v;
        adj=new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }
    void addEdge(int v, int w)
    {
        adj[v].add(w);         // Adds the adjacent vertices into the adjacency linked lists
    }


    void BFSearch(int s)
    {
        boolean visited[]= new boolean[V];  //Creating an array of flag variables called visited
                                            // for each vertex in the graph. It indicates if a particular vertex
                                           // has been visted(true)or not visited(False)

        LinkedList<Integer>  queue= new LinkedList<>();        // Create a queue to store the elements that
                                                               //have been visited

        visited[s]=true;
        queue.add(s);

        while(queue.size()!=0)
        {
                s=queue.poll();                              //dequeueing and printing the dequeued element
                System.out.println(" "+s );

            Iterator<Integer> i= adj[s].listIterator();

            while(i.hasNext())            //while loop iterates through the adjacency list and looks
                                          //for unvisited vertices
            {
                int n=i.next();
                if(!visited[n])             //true when vertex hasnt been visited
                {
                    visited[n]=true;           //visiting the vertex in the adjacency list
                     queue.add(n);             //and adding it to the  queue containing visited vertices
                }
            }
        }

    }

    void DFS(int s)
    {
        boolean visited[]=new boolean[V];
        DFSUtil(s,visited);
    }

    void DFSUtil(int s,boolean visited[])
    {
        visited[s]=true;
        System.out.println(""+ s);
        Iterator<Integer> i= adj[s].listIterator();
        while(i.hasNext())
        {
            int n=i.next();
            if(!visited[n])
            {
                DFSUtil(n,visited);
            }
        }
    }
}
