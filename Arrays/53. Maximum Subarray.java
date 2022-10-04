class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int l = nums.length;
        for(int i=0;i<l;i++)
        {
            sum += nums[i];
            max = Math.max(max,sum);
            if(sum < 0)
            {
                sum = 0;
            }
        }
        return max;
    }
}
