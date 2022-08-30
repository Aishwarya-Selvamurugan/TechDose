class Solution {
    public int singleNumber(int[] nums) {
        int l = nums.length;
        int ones = 0;
        int twos = 0;
        for(int i=0;i<l;i++)
        {
            ones = (ones^nums[i])&(~twos);
            twos = (twos^nums[i])&(~ones);
        }
        return ones;
    }
}
