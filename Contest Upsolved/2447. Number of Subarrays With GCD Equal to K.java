class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int l = nums.length;
        int res = 0;
        for(int i=0;i<l;i++)
        {
            if(nums[i] == k)
            {
                res++;
            }
            int hcf = nums[i];
            for(int j=i+1;j<l;j++)
            {
                hcf = gcd(nums[j],hcf);
                if(hcf == k)
                {
                    res++;
                }
            }
        }
        return res;
    }
    public int gcd(int a,int b)
    {
        return b==0?a:gcd(b,a%b);
    }
}
