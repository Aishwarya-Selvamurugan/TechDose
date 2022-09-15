class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = prices.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<l-1;i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
            }
            else if(prices[i]-min > max)
            {
                max = prices[i]-min;
            }
        }
        return max;
    }
}
