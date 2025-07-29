class Solution {
    public int countIslands(int[][] grid, int k) {

        int m=grid.length,n=grid[0].length;
        int count=0;
        boolean[][] vis = new boolean[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(!vis[i][j] && grid[i][j]>0){
                int[] sum = new int[1];
                dfs(grid, vis, i, j, sum);
                if(sum[0]%k==0)
                count++;
                }
            }
        }

        return count;

    }

    void dfs(int[][] grid, boolean[][] vis, int i, int j, int[] sum)
    {
        int m = grid.length, n = grid[0].length;

         if (i < 0 || j < 0 || i >= m || j >= n ||
            vis[i][j] || grid[i][j] <= 0) {
            return;
        }

        vis[i][j] = true;
        sum[0] += grid[i][j];

        dfs(grid, vis, i + 1, j, sum);
        dfs(grid, vis, i - 1, j, sum);
        dfs(grid, vis, i, j + 1, sum);
        dfs(grid, vis, i, j - 1, sum);
    }
}