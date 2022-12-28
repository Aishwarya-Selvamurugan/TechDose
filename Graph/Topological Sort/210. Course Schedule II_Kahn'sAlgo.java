class Solution {
    int res[];
    int k = 0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> g[] = new ArrayList[numCourses];
        int indeg[] = new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            g[i] = new ArrayList<>();
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            g[prerequisites[i][1]].add(prerequisites[i][0]);
            indeg[prerequisites[i][0]]++;
        }
        res = new int[numCourses];
        if(kahnsAlgo(numCourses,g,indeg))
        {
            return res;
        }
        return new int[]{};
    }
    public boolean kahnsAlgo(int num,List<Integer>[] g,int[] indeg)
    {
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<num;i++)
        {
            if(indeg[i] == 0)
            {
                q.add(i);
            }
        }

        while(!q.isEmpty())
        {
            int a = q.remove();
            for(int i=0;i<g[a].size();i++)
            {
                indeg[g[a].get(i)]--;
                if(indeg[g[a].get(i)] == 0)
                {
                    q.add(g[a].get(i));
                }
            }
            res[k++] = a;
        }
        return k == num;
    }
}
