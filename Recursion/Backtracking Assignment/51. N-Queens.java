class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] b = new char[n][n];
        for(char[] a:b)
        {
            Arrays.fill(a,'.');
        }
        List<int[]> q = new ArrayList<>();
        NQueens(0,n,b,q,res);
        return res;
    }
    public static void NQueens(int row,int n,char[][] b,List<int[]> q,List<List<String>> res)
    {
        if(row == n)
        {
            List<String> l = new ArrayList<>();
            for(char[] a:b)
            {
                l.add(new String(a));
            }
            res.add(l);
            return;
        }
        for(int col=0;col<n;col++)
        {
            if(IsValid(row,col,q))
            {
                q.add(new int[]{row,col});
                b[row][col] = 'Q';
                NQueens(row+1,n,b,q,res);
                q.remove(q.size()-1);
            }
            b[row][col] = '.';
        }
    }
    public static boolean IsValid(int r,int c,List<int[]> q)
    {
        for(int i=0;i<q.size();i++)
        {
            int x = Math.abs(r-q.get(i)[0]);
            int y = Math.abs(c-q.get(i)[1]);
            if(x == 0 || y == 0 || x == y)
            {
                return false;
            }
        }
        return true;
    }
}
