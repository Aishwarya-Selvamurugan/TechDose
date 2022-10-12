class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int l = garbage.length;
        int p = 0;
        int g = 0;
        int m = 0;
        int[][] h = new int[3][l];
        for(int i=0;i<l;i++)
        {
            int l1 = garbage[i].length();
            for(int j=0;j<l1;j++)
            {
                if(garbage[i].charAt(j) == 'P')
                {
                    h[0][i]++;
                }
                else if(garbage[i].charAt(j) == 'G')
                {
                    h[1][i]++;
                }
                else
                {
                    h[2][i]++;
                }
            }
        }
        int count = 0;
        int ref = 0;
        for(int i=0;i<l;i++)
        {
            if(h[0][i] > 0)
            {
                count += (h[0][i]+ref);
                ref = 0;
            }
            if(i<l-1)
            {
                ref += travel[i];
            }
        }
        ref = 0;
        for(int i=0;i<l;i++)
        {
            if(h[1][i] > 0)
            {
                count += (h[1][i]+ref);
                ref = 0;
            }
            if(i<l-1)
            {
                ref += travel[i];
            }
        }
        ref = 0;
        for(int i=0;i<l;i++)
        {
            if(h[2][i] > 0)
            {
                count += (h[2][i]+ref);
                ref = 0;
            }
            if(i<l-1)
            {
                ref += travel[i];
            }
        }
        return count;
    }
}
