class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int l = nums.length;
        int l1 = operations.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<l;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<l1;i++)
        {
            nums[map.get(operations[i][0])] = operations[i][1];
            map.put(operations[i][1],map.remove(operations[i][0]));
        }
        return nums;
    }
}

// TC : O(m+n)
