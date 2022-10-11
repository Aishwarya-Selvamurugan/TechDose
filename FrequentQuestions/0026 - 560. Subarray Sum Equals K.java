class Solution {
    public int subarraySum(int[] nums, int k) {
        int l = nums.length;
        int count = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<l;i++)
        {
            sum += nums[i];
            if(sum == k)
            {
                count++;
            }
            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
