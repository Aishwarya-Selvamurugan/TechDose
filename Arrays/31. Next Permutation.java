class Solution {
    public void nextPermutation(int[] nums) {
        int l = nums.length;
        if(l==1)
        {
            return;
        }
        if(Asc(nums))
        {
            int temp = nums[l-1];
            nums[l-1] = nums[l-2];
            nums[l-2] = temp;
            return;
        }
        int p1=l-1,p2=Integer.MAX_VALUE;
        while(p1-1 >= 0 && nums[p1]<=nums[p1-1])
        {
            p1--;
        }
        
        if(p1 == 0 && nums[p1] >= nums[p1+1])
        {
            Arrays.sort(nums);
            return;
        }
        int ind = -1;
        for(int i=p1+1;i<l;i++)
        {
            if(nums[i] > nums[p1-1] && nums[i] < nums[p1])
            {
                if(nums[i] < p2)
                {
                    p2 = nums[i];
                    ind = i;
                }
            }
        }
        if(ind > -1 && nums[p1-1] < nums[ind])
        {
            int temp = nums[p1-1];
            nums[p1-1] = nums[ind];
            nums[ind] = temp;
        }
        else
        {
            int temp = nums[p1-1];
            nums[p1-1] = nums[p1];
            nums[p1] = temp;
        }
        Arrays.sort(nums,p1,l);
    }
    public static boolean Asc(int[] nums)
    {
        int i = 0;
        int l = nums.length;
        while(i<l-1 && nums[i] <= nums[i+1])
        {
            i++;
        }
        return i==l-1;
    }
}

// TC
// WC : O(NlogN)
