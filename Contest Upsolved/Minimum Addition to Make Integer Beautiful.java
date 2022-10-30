class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        if(nsum(n) <= target)
        {
            return 0;
        }
        int sum = nsum(n);
        long N = n;
        long l = 1;
        while(sum >= target)
        {
            sum -= (int)(N%10);
            N/=10;
            l*=10;
        }
        if(N*l < n)
        {
            if((sum+1) > target)
            {
                l*=10;
            }
            else
            {
                N+=1;
            }
        }
        return N*l-n;
        
    }
    public static int nsum(long n)
    {
        int res = 0;
        while(n>0)
        {
            res += (n%10);
            n/=10;
        }
        return res;
    }
}
