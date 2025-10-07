package org.learnWithM.graphs;

public class NumberOfIslandsProblem {

    // check if safe to visit
    public static boolean isSafe(char[][] grid, int r, int c, boolean[][] visited) {
        int rows = grid.length;
        int cols = grid[0].length;
        return (r >= 0 && r < rows) &&
                (c >= 0 && c < cols) &&
                (grid[r][c] == 'L' && !visited[r][c]);
    }

    public static void dfs(char[][] grid, int r, int c, boolean[][] visited) {
        int[] rNbr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] cNbr = {1, 0, -1, 1, -1, 1, 0, -1};

        visited[r][c] = true;

        for (int k = 0; k < 8; k++) {
            int newR = r + rNbr[k];
            int newC = c + cNbr[k];

            if (isSafe(grid, newR, newC, visited)) {
                dfs(grid, newR, newC, visited);
            }
        }
    }

    public static int countIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        boolean[][] visited = new boolean[row][col];
        int count = 0;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (grid[r][c] == 'L' && !visited[r][c]) {
                    dfs(grid, r, c, visited);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
                { 'L', 'L', 'W', 'W', 'W' },
                { 'W', 'W', 'W', 'W', 'L' },
                { 'L', 'W', 'W', 'L', 'L' },
                { 'W', 'W', 'W', 'W', 'W' },
                { 'L', 'W', 'L', 'L', 'W' }
        };

        System.out.println(countIslands(grid));
    }
}
