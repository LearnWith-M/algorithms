package org.learnWithM.graphs;

import java.util.*;

public class bfsProblem {

    public static void bfs(ArrayList<ArrayList<Integer>> adj) {
        int elementSize = adj.size();

        boolean[] visited = new boolean[elementSize];

        ArrayList<Integer> res = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();

        int s = 0;
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            Integer curr = queue.poll();
            res.add(curr);
            for (Integer x : adj.get(curr)) {
                if (!visited[x]) {
                    queue.add(x);
                    visited[x] = true;
                }
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(List.of(1, 2)));
        adj.add(new ArrayList<>(List.of(0, 2)));
        adj.add(new ArrayList<>(List.of(0, 1, 3, 4)));
        adj.add(new ArrayList<>(List.of(2)));
        adj.add(new ArrayList<>(List.of(2)));

        bfs(adj);
    }
}
