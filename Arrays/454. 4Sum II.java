class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int d:nums4)
        {
            for(int c:nums3)
            {
                map.put(d+c,map.getOrDefault(d+c,0)+1);
            }
        }
        int count = 0;
        for(int a:nums1)
            for(int b:nums2)
            {
                count+=map.getOrDefault(-(a+b),0);
            }
        return count;
    }
}
