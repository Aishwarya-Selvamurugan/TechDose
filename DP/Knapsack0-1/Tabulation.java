import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wt[] = {1,2,3};
		int p[] = {2,3,5};
		int c = 4;
		int dp[][] = new int[wt.length+1][c+1];
		for(int i=0;i<wt.length+1;i++)
		{
		    for(int j=0;j<c+1;j++)
		    {
		        if(i==0 || j==0)
		        {
		            dp[i][j] = 0;
		        }
		        else if(wt[i-1] > j)
		        {
		            dp[i][j] = dp[i-1][j];
		        }
		        else
		        {
		            dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-wt[i-1]]+p[i-1]);
		        }
		    }
		}
		System.out.println(dp[wt.length][c]);
	}
}
