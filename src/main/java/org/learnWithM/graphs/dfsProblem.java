package org.learnWithM.graphs;

import java.util.ArrayList;
import java.util.List;

public class dfsProblem {

    public static void dfsRecurse(ArrayList<ArrayList<Integer>> adj, boolean[] visited, Integer s, ArrayList<Integer> res) {
        res.add(s);
        visited[s] = true;
        for (Integer i : adj.get(s)) {
            if (!visited[i]) {
                dfsRecurse(adj, visited, i, res);
            }
        }
    }

    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        Integer s = 0;
        dfsRecurse(adj, visited, s, res);
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(List.of(2, 3, 1)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(List.of(0, 4)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(List.of(2)));

        dfs(adj);
    }
}
