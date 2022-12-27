import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g[][] = {{0,4,6,0,0,0},{4,0,6,3,4,0},{6,6,0,1,0,0},{0,3,1,0,2,3},{0,4,0,2,0,7},{0,0,0,3,7,0}};
		int e[][] = {{0,1,4},{0,2,6},{1,4,4},{1,2,6},{1,3,3},{2,3,1},{4,3,2},{4,5,7},{3,5,3}};
		PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[1]-b[1]));
		Prims(g,pq);
		return;
	}
	public static void Prims(int[][] g,PriorityQueue<int[]> pq)
	{
	    int n = g.length;
	    int d[] = new int[n];
	    boolean mstSET[] = new boolean[n];
	    int p[] = new int[n];
	    Arrays.fill(d,Integer.MAX_VALUE);
	    p[0] = -1;
	    d[0] = 0;
	    pq.add(new int[]{0,0});
	    for(int i=0;i<n-1;i++)
	    {
	        while(!pq.isEmpty() && mstSET[pq.peek()[0]]==true)
	        {
	            pq.remove();
	        }
	        int U = pq.remove()[0];
	        mstSET[U] = true;
	        for(int j=0;j<n;j++)
	        {
	            if(g[U][j] != 0 && mstSET[j] == false && g[U][j] < d[j])
	            {
	                d[j] = g[U][j];
	                p[j] = U;
	                pq.add(new int[]{j,d[j]});
	            }
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.println(i+" "+p[i]);
	    }
	}
}
