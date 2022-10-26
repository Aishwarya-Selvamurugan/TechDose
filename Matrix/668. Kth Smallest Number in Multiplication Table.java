class Solution {
    public int findKthNumber(int m, int n, int k) {
        int min = 1;
        int max = m*n;
        while(min<=max)
        {
            int mid = min +(max-min)/2;
            if(find(m,n,mid) >=  k)
            {
                max = mid-1;
            }
            else
            {
                min = mid+1;
            }
        }
        return min;
    }
    public static int find(int m,int n,int k)
    {
        int c = 0;
        for(int i=1;i<=m;i++)
        {
            c += Math.min(k/i,n);
        }
        return c;
    }
}
