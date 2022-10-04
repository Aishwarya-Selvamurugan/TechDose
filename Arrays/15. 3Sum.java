class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int l = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<l;i++)
        {
            while(i>0 &&i<l && nums[i-1]==nums[i])
            {
                i++;
            }
            
            int low = i+1;
            int high = l-1;
            while(low<high)
            {
                if(nums[i]+nums[low]+nums[high] == 0)
                {
                    List<Integer> lst = new ArrayList<>();
                    lst.add(nums[i]);
                    lst.add(nums[low]);
                    lst.add(nums[high]);
                    low++;
                    while(low<high && nums[low-1]==nums[low])
                    {
                        low++;
                    }
                    res.add(lst);
                }
                else if(nums[i]+nums[low]+nums[high] < 0)
                {
                    low++;
                }
                else
                {
                    high--;
                }
                
            }
        }
        return res;
    }
}

// TC : O(N^2)
