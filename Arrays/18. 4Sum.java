class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int l = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<l-3;i++)
        {
            
            if(i>0 && nums[i]==nums[i-1])
            {
                
                continue;
            }
            for(int j=i+1;j<l-2;j++)
            {
                if(j>i+1 && nums[j] == nums[j-1])
                {
                    continue;
                }
                long target2 = Long.valueOf(target)-(nums[i]+nums[j]);
                int low = j+1;
                int high = l-1;
                while(low < high)
                {
                    long sum = nums[low]+nums[high];
                    if(sum > target2)
                    {
                        high--;
                    }
                    else if(sum == target2)
                    {
                        List<Integer> lst = new ArrayList<>();
                        lst.add(nums[i]);
                        lst.add(nums[j]);
                        lst.add(nums[low]);
                        lst.add(nums[high]);
                        set.add(lst);
                        
                        low++;
                    }
                    else
                    {
                        low++;
                    }
                }
            }
        }
        for(List<Integer> ls:set)
        {
            list.add(ls);
        }
        return list;
    }
}
