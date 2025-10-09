package org.learnWithM.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SnakeAndLadderProblem {

    public static int minNumberOfDiceThrows(int[] moves) {
        int n = moves.length;
        boolean[] visited = new boolean[n];

        Queue<int[]> q = new LinkedList<>();

        // Adding first destination with number of moves: cell 0, moves 0
        q.add(new int[]{0, 0});
        visited[0] = true;

        while (!q.isEmpty()) {
            int[] curr = q.peek();

            int v = curr[0];
            int dist = curr[1];

            if (v == n - 1) {
                return dist;
            }

            q.remove();

            for (int i = v + 1; (i <= v + 6 && i < n); i++) {
                if (!visited[i]) {
                    int dest = moves[i] != -1 ? moves[i] : i;
                    q.add(new int[]{dest, dist + 1});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 30;
        int[] moves = new int[n];
        Arrays.fill(moves, -1);

        // Ladders
        moves[2] = 21;
        moves[4] = 7;
        moves[10] = 25;
        moves[19] = 28;

        // Snakes
        moves[26] = 0;
        moves[20] = 8;
        moves[16] = 3;
        moves[18] = 6;

        System.out.println(minNumberOfDiceThrows(moves));
    }
}
