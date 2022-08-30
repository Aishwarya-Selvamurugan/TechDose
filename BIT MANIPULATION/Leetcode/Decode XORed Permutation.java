class Solution {
    public int[] decode(int[] encoded) {
        int a1 = 0;
        int n = encoded.length+1;
        for(int i=1;i<=n;i++)
        {
            a1 =  a1^i;
        }
        for(int i=1;i<n-1;i+=2)
        {
            a1 =  a1^encoded[i];
        }
        int res[] = new int[n];
        res[0] = a1;
        for(int i=1;i<n;i++)
        {
            res[i] = res[i-1]^encoded[i-1];
        }
        return res;
    }
}
