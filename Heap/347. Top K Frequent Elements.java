class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int l = nums.length;
        for(int i=0;i<l;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size() < k)
        {
            return null;
        }
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b)->{return map.get(b)-map.get(a);});
        for(int m:map.keySet())
        {
            maxheap.offer(m);
        }
        int res[] = new int[k];
        for(int i=0;i<k;i++)
        {
            res[i] = maxheap.poll();
        }
        return res;
    }
}
