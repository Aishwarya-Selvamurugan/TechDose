class Solution {
    class Node{
        String num;
        int index;
        Node(String num,int index)
        {
            this.num = num;
            this.index = index;
        }
    }
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        HashMap<Integer,Node[]> res = new HashMap<>();
        int r[] = new int[queries.length];
        int len = nums[0].length();
        int ind = 0;
        for(int[] q:queries)
        {
            if(!res.containsKey(q[1]))
            {
                Node[] n = new Node[nums.length];
                for(int i=0;i<nums.length;i++)
                {
                    String s = nums[i].substring(len-q[1],len);
                    n[i] = new Node(s,i);
                }
                Arrays.sort(n,(a,b)->a.num.compareTo(b.num));
                res.put(q[1],n);
            }
            r[ind++] = res.get(q[1])[q[0]-1].index;
        }
        return r;
    }
}
