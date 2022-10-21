class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        Arrays.sort(tiles,(a,b)->a[0]-b[0]);
        int l = tiles.length;
        int pref[] = new int[l];
        pref[0] = tiles[0][1]-tiles[0][0]+1;
        for(int i=1;i<l;i++)
        {
            pref[i] = pref[i-1] + tiles[i][1]-tiles[i][0]+1;
            // System.out.println(pref[i]);
        }
        int max = 0;
        for(int i=0;i<l;i++)
        {
            int car = tiles[i][0]+carpetLen-1;
            int start = i;
            int end = l-1;
            int pos = i;
            while(start <= end)
            {
                int mid = start + (end-start)/2;
                if(tiles[mid][0] > car)
                {
                    end = mid-1;
                }
                else
                {
                    pos = mid;
                    start = mid+1;
                }
                // System.out.println(pos);
            }
            
            int extra = 0;
            if(tiles[pos][1] >= car)
            {
                extra = car - tiles[pos][0]+1;
            }
            else
            {
                extra = tiles[pos][1]-tiles[pos][0]+1;
            }
            
            int sum = (pos-1 >= 0 ? pref[pos-1]:0)-(i-1>=0 ? pref[i-1]:0)+extra;
            max = Math.max(sum,max);
            // System.out.println(max);
        }
        return max;
    }
}
