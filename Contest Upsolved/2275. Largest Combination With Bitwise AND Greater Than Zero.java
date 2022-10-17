class Solution {
    public int largestCombination(int[] candidates) {
        int l = candidates.length;
        int max = 0;
        for(int i=0;i<32;i++)
        {
            int count = 0;
            for(int j=0;j<l;j++)
            {
                if((candidates[j]&(1<<i)) > 0)
                {
                    count++;
                }
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
