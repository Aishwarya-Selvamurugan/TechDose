class KthLargest {
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    int K;
    public KthLargest(int k, int[] nums) {
        K = k;
        for(int n:nums){
        minheap.offer(n);
        if(minheap.size() > k)
        {
            minheap.poll();
        }
        }
    }
    
    public int add(int val) {
        minheap.offer(val);
        if(minheap.size() > K)
        minheap.poll();
        return minheap.peek();
    }
}
