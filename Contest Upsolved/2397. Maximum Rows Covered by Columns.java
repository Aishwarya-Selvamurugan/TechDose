class Solution {
    int res = 0;
    public int maximumRows(int[][] matrix, int numSelect) {
        boolean[] c = new boolean[matrix[0].length];
        pickCols(matrix,numSelect,0,0,c);
        return res;
    }
    public void pickCols(int[][] matrix, int cols,int curr,int index,boolean[] c)
    {
        if(matrix[0].length == index)
        {
            int count = 0;
            for(int i=0;i<matrix.length;i++)
            {
                boolean flag = true;
                for(int j=0;j<matrix[0].length;j++)
                {
                    if(matrix[i][j] == 1)
                    {
                        if(c[j] == false)
                        {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag)
                {
                    count++;
                }
            }
            res = Math.max(res,count);
            // System.out.println(res);
            return;
        }
        if(cols > curr)
        {
            c[index] = true;
        pickCols(matrix,cols,curr+1,index+1,c);
            c[index] = false;
        }
        pickCols(matrix,cols,curr,index+1,c);
        return ;
    }
}
