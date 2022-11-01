class Solution {
    public int findMaxLength(int[] nums) {
        int l = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0,max = 0;
        for(int i=0;i<l;i++)
        {
            sum += nums[i]==0?-1:1;
            if(sum == 0)
            {
                max = Math.max(max,i+1);
            }
            else if(map.containsKey(sum))
            {
                max = Math.max(max,i-map.get(sum));
            }
            else{
            map.put(sum,i);
            }
        }
        return max;
    }
}
