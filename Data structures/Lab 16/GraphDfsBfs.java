import java.util.*;
import java.util.LinkedList;

public class GraphDfsBfs{
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        // g.addEdge(1, 4);
        // g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(3, 6);
        g.addEdge(5, 6);
        
        // g.DFS(1);
        g.BFS(1);
    }
}
class Graph{
    public Map<Integer , List<Integer>> adjList;

    public Graph(){
        adjList = new HashMap<>();
    }

    public void DFS(int start){
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start , visited);
    }

    public void dfsHelper(int vertex , Set<Integer> visited){
        visited.add(vertex);
        System.out.print(vertex+ " ");
        for (int neighbour : adjList.getOrDefault(vertex, new ArrayList<>())) {
            if(!visited.contains(neighbour)){
                dfsHelper(neighbour, visited);
            }
        }
    }

    public void BFS(int start){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> que  = new LinkedList<>();

        que.add(start);
        visited.add(start);
        while (!que.isEmpty()) {
            int vertex = que.poll();
            System.out.print(vertex + " ");
            for (int neighbour : adjList.getOrDefault(vertex , new ArrayList<>())) {
                if(!visited.contains(neighbour)){
                    que.add(neighbour);
                    visited.add(neighbour);
                }
            }
        }
    }

    public void addEdge(int x , int y){
        adjList.putIfAbsent(x, new ArrayList<Integer>());
        adjList.putIfAbsent(y, new ArrayList<Integer>());
        adjList.get(x).add(y);
        adjList.get(y).add(x);
    }
}