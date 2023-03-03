
import java.util.*;
public class Main{
    static class Edge{
        int dest;
        int src;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){            //done to avoid null pointer exception
            graph[i]=new ArrayList<Edge>();

        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));


    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge>graph[]=new ArrayList[v];  //array of arrayList Adjacency list
        createGraph(graph);
        for(int i=0;i<graph[1].size();i++){ ///printing the neighbours of 2 node
            Edge e=graph[1].get(i);
            System.out.println(e.dest);
        }

    }
}