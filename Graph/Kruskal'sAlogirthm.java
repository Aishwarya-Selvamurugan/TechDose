import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = 6,E = 9;
// 		int g[][] = {{0,1,1},{0,2,2},{1,4,3},{1,3,1},{1,2,3},{2,4,1},{2,3,2},{3,4,2},{3,5,4},{4,5,3}};
        int g[][] = {{0,1,4},{0,2,6},{1,4,4},{1,2,6},{1,3,3},{2,3,1},{4,3,2},{4,5,7},{3,5,3}};
		kruskal(g,V,E);
	}
	public static void kruskal(int[][] g,int V,int E)
	{
	    Node[] n = new Node[V];
	    for(int i=0;i<V;i++)
	    {
	        n[i] = new Node(-1,0);
	    }
	    List<int[]> res = new ArrayList<>();
	    Arrays.sort(g,(a,b)->a[2]-b[2]);
		
		int i=0,j=0;
		while(i<V-1 && j<E)
		{
		    int x = find(g[j][0],n);
		    int y = find(g[j][1],n);
		    if(x == y)
		    {
		        j++;
		        continue;
		    }
		    
		    union(x,y,n);
		    res.add(new int[]{g[j][0],g[j][1]});
		    i++;
		    j++;
		}
		for(int k=0;k<res.size();k++)
		{
		    System.out.println(res.get(k)[0]+" "+res.get(k)[1]);
		}
	}
	static class Node{
	    int parent;
	    int rank;
	    Node(int p,int r)
	    {
	        this.parent = p;
	        this.rank = r;
	    }
	    
	}
	public static boolean union(int px,int py,Node[] n)
	{
	    
	    if(px == py)
	    {
	        return true; 
	    }
	    else{
	        if(n[py].rank == n[px].rank)
	        {
	            n[py].parent = px;
	            n[px].rank++;
	            
	        }
	        else
	        {
	            if(n[py].rank > n[px].rank)
	            {
	                n[px].parent = py;
	            }
	            else
	            {
	                n[py].parent = px;
	            }
	        }
	        return false;
	    }
	}
	public static int find(int val,Node n[])
	{
	    if(n[val].parent == -1)
	    {
	        return val;
	    }
	    return n[val].parent = find(n[val].parent,n);
	    
	}
}
