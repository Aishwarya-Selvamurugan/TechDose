class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] =='1')
                {
                    island(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void island(char[][] grid,int i,int j)
    {
        int m = grid.length;
        int n = grid[0].length;
        if(grid[i][j] == '1')
        {
        grid[i][j] = '0';
        if(i+1 < m)
        {
        island(grid,i+1,j);
        }
        if(j-1 >= 0)
        island(grid,i,j-1);
        if(j+1 < n)
        island(grid,i,j+1);
        if(i-1 >= 0)
        island(grid,i-1,j);
        }
    }
}
