class Solution {
    public int maximumXOR(int[] nums) {
        int l = nums.length;
        int[] res = new int[32];
        int mask = 1;
        for(int i=0;i<32;i++)
        {
            for(int j=0;j<l;j++)
            {
                if((mask & nums[j]) > 0)
                {
                    res[i]++;
                }
            }
            mask <<= 1;
        }
        int ans = 0;
        mask = 1;
        for(int i=0;i<32;i++)
        {
            if(res[i] > 0)
            {
                if(res[i]%2==0)
                {
                    ans = ans|mask;
                }
            }
            mask <<= 1;
        }
        int r = 0;
        for(int i=0;i<l;i++)
        {
            r ^= nums[i];
        }
        return r^ans;
    }
}
