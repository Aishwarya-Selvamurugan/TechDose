class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long res[] = new long[n+1];
        res[1] = 1;
        long secret = 0;
        for(int i=2;i<=n;i++)
        {
            long d = (res[Math.max(i-delay,0)]-res[Math.max(i-forget,0)]+secret+((long)1e9+7))%((long)1e9+7);
            secret = d;
            res[i] = secret;
        }
        
        long r = 0;
        // for(int i=1;i<=n;i++)
        // {
        //     System.out.println(res[i]);
        // }
        for(int i = n-forget+1;i<=n;i++)
        {
            r = (r+res[i])%((long)1e9+7);
        }
        return (int)r;
    }
}
