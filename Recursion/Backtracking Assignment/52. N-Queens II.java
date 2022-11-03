class Solution {
    int res = 0;
    public int totalNQueens(int n) {
        List<int[]> q = new ArrayList<>();
        NQueens(0,n,q);
        return res;
    }
    public void NQueens(int r,int n,List<int[]> q)
    {
        if(r == n)
        {
            res++;
            return;
        }
        for(int c=0;c<n;c++)
        {
            if(IsValid(r,c,q))
            {
                q.add(new int[]{r,c});
                NQueens(r+1,n,q);
                q.remove(q.size()-1);
            }
        }
    }
    public boolean IsValid(int r,int c,List<int[]> q)
    {
        for(int[] Q:q)
        {
            int x = Math.abs(Q[0]-r);
            int y = Math.abs(Q[1]-c);
            if(x == 0 || y == 0 || x == y)
            {
                return false;
            }
        }
        return true;
    }
}
