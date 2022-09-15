class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    
                    a[0] = i;
                    a[1] = j;
                    
                }
            }
        }
        return a;
    }   
}


//=============================================================================//

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<l;i++)
        {
                map.put(nums[i],i);
        }
        for(int i=0;i<l;i++)
        {
            if(map.containsKey(target-nums[i]) && i!= map.get(target-nums[i]))
            {
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        return nums;
    }
}
