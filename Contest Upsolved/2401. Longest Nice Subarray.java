class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l = nums.length;
        int mask = 0,max = 0;
        for(int i=0;i<l;i++)
        {
            int j=i;
            while(j<l && (mask&nums[j])==0)
            {
                
                mask = mask ^ nums[j];
                j++;
            }
            max = Math.max(max,j-i);
            mask = 0;
        }
        return max;
    }
}
