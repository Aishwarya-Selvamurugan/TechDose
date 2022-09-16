class Solution {
    public int[] productExceptSelf(int[] nums) {
        int s = 1,c=0;
        for(int num:nums)
        {
            if(num == 0)
            {
                c++;
            }
            else{
            s*=num;
            }
        }
        System.out.println(s);
        for(int i=0;i<nums.length;i++)
        {
            if(c>=1){
                if(nums[i] == 0 && c==1)
                {
                    nums[i] = s;
                }
                else
                {
                    nums[i] = 0;
                }
            }
            else{
            nums[i] = s/nums[i];
            }
        }
        return nums;
    }
}
