class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b)->{return b[0]-a[0];});
        int l = nums.length;
        int res[] = new int[l-k+1];
        int s = 0;
        for(int i=0;i<l;i++)
        {
            maxheap.offer(new int[]{nums[i],i});
            if(i>=k-1)
            {
                res[s++] = maxheap.peek()[0];
            }
            while(maxheap.size() > 0 && i-maxheap.peek()[1]+1 >= k)
            {
                maxheap.poll();
            }
        }
        return res;
    }
}
