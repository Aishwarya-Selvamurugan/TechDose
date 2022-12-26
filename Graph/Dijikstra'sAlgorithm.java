import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g[][] = {{0,4,6,0,0,0},{4,0,6,3,4,0},{6,6,0,1,0,0},{0,3,1,0,2,3},{0,4,0,2,0,7},{0,0,0,3,7,0}};
		Dijikstra(g);
		return;
	}
	public static void Dijikstra(int[][] g)
	{
	    int n = g.length;
	    int d[] = new int[n];
	    boolean mstSET[] = new boolean[n];
	    int p[] = new int[n];
	    Arrays.fill(d,Integer.MAX_VALUE);
	    p[0] = -1;
	    d[0] = 0;
	    
	    for(int i=0;i<n-1;i++)
	    {
	        int U = min(mstSET,d);
	        mstSET[U] = true;
	        for(int j=0;j<n;j++)
	        {
	            if(g[U][j] != 0 && mstSET[j] == false && d[U]+g[U][j] < d[j])
	            {
	                d[j] = d[U]+g[U][j];
	                p[j] = U;
	            }
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.println(i+" "+p[i]);
	    }
	}
	public static int min(boolean[] set,int d[])
	    {
	        int min = Integer.MAX_VALUE;
	        int index = -1;
	        for(int i=0;i<set.length;i++)
	        {
	            if(set[i] == false)
	            {
	                if(d[i] < min)
	                {
	                    min = d[i];
	                    index = i;
	                }
	            }
	        }
	        return index;
	    }
}
