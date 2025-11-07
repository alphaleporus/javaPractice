package PracticalPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph {
    int node;
    int v;
    boolean[] isVisited;
    int[][]adj;

    public graph(int n){
        node = n;
        isVisited = new boolean[n];
        adj = new int [n][n];
    }

    public void addEdge(int src, int dst) {
        adj[src][dst] = 1;
        adj[dst][src] = 1;
    }

    public void dfs(int n){
        isVisited[n]=true;
        System.out.println(n + " ");

        for(int i =0; i<=n; i++){
            if(adj[n][i]==1 && !isVisited[i]){
                dfs(i);
            }
        }
    }

    public void bfs(int start){
        boolean[] visited = new boolean[node];
        Queue<Integer> q= new LinkedList<>();

        visited[start]=true;
        q.add(start);

        while(!q.isEmpty()){
            int n = q.remove();
        }
    }



}
