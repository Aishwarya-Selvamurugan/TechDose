class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] g = new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            g[i] = new ArrayList<>();
        }
        int in[] = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++)
        {
            g[prerequisites[i][1]].add(prerequisites[i][0]);
            in[prerequisites[i][0]]++;
        }
        return BFS(g,in);
    }
    public boolean BFS(List<Integer>[] g,int in[])
    {
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<in.length;i++)
        {
            if(in[i] == 0)
            {
                q.add(i);
                count++;
            }
        }
        while(!q.isEmpty())
        {
            int a = q.remove();
            for(int i=0;i<g[a].size();i++)
            {
                in[g[a].get(i)]--;
                if(in[g[a].get(i)] == 0)
                {
                    q.add(g[a].get(i));
                    count++;
                }
            }
        }
        System.out.println(count);
        return count == in.length;
    }
}
