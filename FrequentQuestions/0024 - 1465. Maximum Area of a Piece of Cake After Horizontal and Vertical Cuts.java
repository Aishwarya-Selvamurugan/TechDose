class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long max = 0;
        for(int i=0;i<horizontalCuts.length;i++)
        {
            if(i == 0)
            {
                max = Math.max(horizontalCuts[i]-0,max);
            }
            else
            {
                max = Math.max(horizontalCuts[i]-horizontalCuts[i-1],max);
            }
            if(i == horizontalCuts.length-1)
            {
                max = Math.max(h-horizontalCuts[i],max);
            }
        }
        long max1 = 0;
        for(int i=0;i<verticalCuts.length;i++)
        {
            if(i == 0)
            {
                max1 = Math.max(verticalCuts[i]-0,max1);
            }
            else
            {
                max1 = Math.max(verticalCuts[i]-verticalCuts[i-1],max1);
            }
            if(i == verticalCuts.length-1)
            {
                max1 = Math.max(w-verticalCuts[i],max1);
            }
        }
        long res = ((max1*max)%1000000007);
        return (int)res;
        
    }
}
