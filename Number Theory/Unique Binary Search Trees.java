class Solution {
    public int numTrees(int n) {
        int cat[] = new int[n+1];
        cat[0] = 1;
        cat[1] = 1;
        for(int i=2;i<=n;i++)
        {
            cat[i] = 0;
            for(int j=0;j<i;j++)
            {
                cat[i] += cat[j] * cat[i-1-j];
            }
        }
        return cat[n];
    }
}
