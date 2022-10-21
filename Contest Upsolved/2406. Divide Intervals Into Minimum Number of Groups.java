class Solution {
    public int minGroups(int[][] intervals) {
        int l = intervals.length;
        Arrays.sort(intervals,(a,b)-> a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        Queue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<l;i++)
        {
            int s = intervals[i][0];
            int e = intervals[i][1];
            if(!(q.isEmpty()) && s > q.peek())
            {
                q.poll();
            }
            q.offer(e);
        }
        return q.size();
    }
}
