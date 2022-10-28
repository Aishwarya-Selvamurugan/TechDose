ass Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        PriorityQueue<int[]> av = new PriorityQueue<>((a,b)->(a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]));
        PriorityQueue<int[]> un = new PriorityQueue<>((a,b)->a[2]!=b[2]?a[2]-b[2]:(a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]));
        
        int l1 = servers.length;
        int l2 = tasks.length;
        
        for(int i=0;i<l1;i++)
        {
            av.offer(new int[]{servers[i],i,0});
        }
        int res[] = new int[l2];
        for(int i=0;i<l2;i++)
        {
            int t = tasks[i];
            while(!un.isEmpty() && un.peek()[2] <= i)
            {
                av.add(un.poll());
            }
            if(!av.isEmpty())
            {
                int[] curr = av.poll();
                curr[2] = i+t;
                un.offer(curr);
                res[i] = curr[1];
            }
            else if(av.isEmpty())
            {
                int[] curr = un.poll();
                res[i] = curr[1];
                curr[2] += t;
                un.offer(curr);
            }
        }
        return res;
    }
}
