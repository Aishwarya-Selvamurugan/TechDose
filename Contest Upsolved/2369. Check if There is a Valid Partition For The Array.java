class Solution {
    public boolean validPartition(int[] nums) {
        int h[] = new int[nums.length];
        if(nums.length == 2){
            return nums[0] == nums[1];
        }
        Arrays.fill(h,-1);
        return func(nums,0,h);
    }
    public boolean func(int[] nums,int i,int[] h)
    {
        if(i == nums.length)
        {
            return true;
        }
        if(h[i] != -1)
        {
            return h[i]==0?false:true;
        }
        if(i+1<nums.length && nums[i] == nums[i+1])
        {
            
            if(func(nums,i+2,h)) {
                h[i] = 1;
                return true;
            }
            
        }
        if(i+2 < nums.length && nums[i] == nums[i+1] && nums[i] == nums[i+2])
            {
                if(func(nums,i+3,h)) {
                h[i] = 1;
                return true;
            }
            }
        if(i+2 < nums.length && nums[i]+1 == nums[i+1] && nums[i]+2 == nums[i+2])
        {
            if(func(nums,i+3,h)) {
                h[i] = 1;
                return true;
            }
        }
                h[i] = 0;
                return false;
    }
}
