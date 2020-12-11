package com.strings;

public class P200NoOfIslands {

    public int numIslands(char[][] grid) {

        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1') {

                    dfs(i, j, grid.length, grid[0].length, grid);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int dx, int dy, int x, int y, char[][] grid){
        if(dx < 0 || dy < 0 || dx >= grid.length || dy >= grid[0].length || grid[dx][dy] == '0') return;

        grid[dx][dy] = '0';

        dfs(dx + 1, dy, x, y, grid);

        dfs(dx - 1, dy, x, y, grid);
        dfs(dx, dy + 1, x, y, grid);
        dfs(dx, dy - 1, x, y, grid);

    }
}
