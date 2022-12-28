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

=========================================================================================
 
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
        }
        return formscycle(g);
    }
    public boolean formscycle(List<Integer>[] g)
    {
        int[] v = new int[g.length];
        for(int i=0;i<g.length;i++)
        {
            if(v[i] == 0)
            {
                if(dfs(i,v,g))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int n,int[] v,List<Integer>[] g)
    {
        if(v[n] == 1)
        {
            return true;
        }
        if(v[n] == 2){
            return false;
        }
        v[n] = 1;
        for(int i=0;i<g[n].size();i++)
        {
            if(dfs(g[n].get(i),v,g))
            {
                return true;
            }
        }
        v[n] = 2;
        return false;
    }
}    
