class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> l = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        l.add(intervals[0]);
        for(int i=0;i<intervals.length;i++)
        {
            if(intervals[i][0] <= l.get(l.size()-1)[1])
            {
                int s = l.get(l.size()-1)[0];
                int e = Math.max(intervals[i][1],l.get(l.size()-1)[1]);
                l.remove(l.size()-1);
                l.add(new int[]{s,e});
            }
            else{
            l.add(intervals[i]);
            }
        }
        return l.toArray(new int[l.size()][2]);
    }
}
