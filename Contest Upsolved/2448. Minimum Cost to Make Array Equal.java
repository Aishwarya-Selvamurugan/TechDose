class Solution {
    public long minCost(int[] nums, int[] cost) {
        int l = nums.length;
        long min = 1;
        long max = 1000000L;
        long c = 0;
        for(int i=0;i<l;i++)
        {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        if(c == l)
        {
            return 0;
        }
        long res = Integer.MAX_VALUE;
        while(min <= max)
        {
            long mid = min+(max-min)/2;
            long r1 = funCheck(nums,cost,mid);
            long r2 = funCheck(nums,cost,mid-1);
            long r3 = funCheck(nums,cost,mid+1);
            if(r1 <= r2 && r1 <= r3)
            {
                return r1;
            }
            else if(r2 < r1)
            {
                max = mid;
            }
            else
            {
                min = mid;
            }
        }
        return res;
    }
    public long funCheck(int[] nums,int[] cost,long mid)
    {
        long res = 0;
        for(int i=0;i<nums.length;i++)
        {
            res += Math.abs(nums[i]-mid)*cost[i];
        }
        System.out.println(res);
        return res;
    }
}
