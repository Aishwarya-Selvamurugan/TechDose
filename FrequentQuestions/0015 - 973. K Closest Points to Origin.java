class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int l = points.length;
        int res[][] = new int[k][2];
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
        for(int i=0;i<l;i++)
        {
            q.offer(new int[]{points[i][0],points[i][1]});
            if(q.size() > k)
            {
                q.poll();
            }
        }
        for(int i=0;i<k;i++)
        {
            res[i] = q.poll();
        }
        return res;
    }
}
