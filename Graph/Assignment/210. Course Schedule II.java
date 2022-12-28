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

=============================================================================================================
    
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> g[] = new ArrayList[numCourses];
        
        for(int i=0;i<numCourses;i++)
        {
            g[i] = new ArrayList<>();
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            g[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        if(formsCycle(g,numCourses))
        {
            return new int[]{};
        }
        int res[] = new int[numCourses];
        boolean vis[] = new boolean[numCourses];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<numCourses;i++)
        {
            if(!vis[i])
            {
                dfs(i,vis,g,s);
            }
        }
        int k = 0;
        while(!s.isEmpty())
        {
            res[k++] = s.pop();
        }
        return res;
    }
    public void dfs(int n,boolean[] vis,List<Integer>[] g,Stack<Integer> s)
    {
        vis[n] = true;
        for(int i=0;i<g[n].size();i++)
        {
            if(!vis[g[n].get(i)])
            {
                dfs(g[n].get(i),vis,g,s);
            }
        }
        s.push(n);
    }
    public boolean formsCycle(List<Integer>[] g,int num)
    {
        int v[] = new int[num];
        for(int i=0;i<num;i++)
        {
            if(v[i]==0)
            {
                if(detectCycle(i,v,g))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean detectCycle(int n,int[] v,List<Integer>[] g)
    {
        if(v[n] == 1)
        {
            return true;
        }
        if(v[n] == 2)
        {
            return false;
        }
        v[n] = 1;
        for(int i=0;i<g[n].size();i++)
        {
            if(detectCycle(g[n].get(i),v,g))
            {
                return true;
            }
        }
        v[n] = 2;
        return false;
    }

}    

