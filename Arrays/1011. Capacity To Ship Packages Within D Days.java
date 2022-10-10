class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = weights.length;
        int max = 0;
        int min = 0;
        for(int i=0;i<l;i++)
        {
            min = Math.max(weights[i],min);
            max += weights[i];
        }
        while(min <= max)
        {
            int mid = min + (max-min)/2;
            if(search(mid,weights,days))
            {
                max = mid-1;
            }
            else
            {
                min = mid+1;
            }
        }
        return min;
    }
    public static boolean search(int mid,int[] weights,int days)
    {
        int sum = 0;
        for(int i=0;i<weights.length;i++)
        {
            if(sum+weights[i] <= mid)
            {
                sum+=weights[i];
            }
            else
            {
                if(days == 1)
                {
                    return false;
                }
                days--;
                sum = weights[i];
            }
        }
        return true;
    }
}
