package org.learnWithM.graphs;

import java.util.*;

public class bipartiteGraphProblem {
    public static ArrayList<ArrayList<Integer>> contructAdj(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        //  Add a list for each vertex
        for (int i = 0; i < V; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }

        return adjacencyList;
    }


    public static boolean isBipartite(int V, int[][] edges) {

        int[] colored = new int[V];
        Arrays.fill(colored, -1);

        ArrayList<ArrayList<Integer>> adj = contructAdj(V, edges);

        for (int i = 0; i < V; i++) {
            if (colored[i] == -1) {
                Queue<Integer> q = new LinkedList<>();
                colored[i] = 1;
                q.offer(i);

                while (!q.isEmpty()) {
                    int curr = q.poll();
                    for (int v : adj.get(curr)) {
                        if (colored[v] == -1) {
                            colored[v] = 1 - colored[curr];
                            q.offer(v);
                        } else if (colored[v] == colored[curr]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};
        System.out.println(isBipartite(V, edges));

        int U = 4;
        int[][] edges2 = new int[][]{{0, 1}, {1, 2}, {2, 3}};
        System.out.println(isBipartite(U, edges2));

    }
}
