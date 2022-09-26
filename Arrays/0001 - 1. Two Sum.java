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
