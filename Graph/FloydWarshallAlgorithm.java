import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e[][] = {{0,1,3},{0,3,5},{1,0,2},{1,3,8},{2,1,1},{3,2,2}};
		int d[][] = new int[4][4];
		for(int[] ed:d)
		{
		    Arrays.fill(ed,99999);
		}
		for(int i=0;i<e.length;i++)
		{
		    d[e[i][0]][e[i][1]] = e[i][2];
		}
		for(int i=0;i<4;i++)
		{
		    d[i][i] = 0;
		}
		print(d);
		for(int k=0;k<4;k++)
		{
		    for(int i=0;i<4;i++)
		    {
		        for(int j=0;j<4;j++)
		        {
		            if(i == k || j == k)
		            {
		                continue;
		            }
		            if (d[i][k] + d[k][j] < d[i][j])
		                d[i][j] = d[i][k] + d[k][j];
		        }
		    }
		    print(d);
		}
		
	}
	public static void print(int[][] d)
	{
	    for(int i=0;i<4;i++)
		{
		    for(int j=0;j<4;j++)
		    {
		        if(d[i][j] == 99999)
		        {
		            System.out.print("INF ");
		            continue;
		        }
		        System.out.print(d[i][j]+" ");
		    }
		    System.out.println();
		}
		System.out.println();
	}
}
