class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int l = nums.length;
        long sum = 0;
        int min = Integer.MAX_VALUE;
        Deque<Pair<Long,Integer>> d = new ArrayDeque<>();
        for(int i=0;i<l;i++)
        {
            sum += nums[i];
            if(sum >= k)
            {
                min = Math.min(min,i+1);
            }
            Pair curr = new Pair(Integer.MIN_VALUE,Integer.MIN_VALUE);
            while(!d.isEmpty() && (sum-d.getFirst().getKey())>=k)
            {
                curr = d.getFirst();
                d.pollFirst();
            }
            if((int)curr.getValue() != (int)Integer.MIN_VALUE)
            {
                min = Math.min(min,i-(int)curr.getValue());
            }
            while(!d.isEmpty() && sum<=(d.getLast()).getKey())
            {
                d.removeLast();
            }
            d.add(new Pair <Long,Integer> (sum, i));
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}

//TC : O(N)
