class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j] == '1'){
                islands(grid,i,j);
                count++;
                }
            }
        }
        return count;
    }
    public static void islands(char[][] grid,int i,int j)
    {
        if(grid[i][j] == '1')
        {
            grid[i][j] = '0';
            int r = grid.length;
        int c = grid[0].length;
        if(j+1 < c)
        {
            islands(grid,i,j+1);
        }
        if(i+1 < r)
        {
            islands(grid,i+1,j);
        }
        if(j-1 >= 0)
        {
            islands(grid,i,j-1);
        }
        if(i-1 >= 0)
        {
            islands(grid,i-1,j);
        }
        }
    }
}
