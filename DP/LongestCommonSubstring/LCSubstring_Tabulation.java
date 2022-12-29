import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "CAAAXYZPXYZP";
		String s2 = "DAAAXYZP";
		int l1 = s1.length();
		int l2 = s2.length();
		int dp[][] = new int[l1+1][l2+1];
		int max = 0;
		for(int i=0;i<=l1;i++)
		{
		    for(int j=0;j<=l2;j++)
		    {
		        if(i == 0 || j == 0)
		        {
		            dp[i][j] = 0;
		        }
		        else if(s1.charAt(i-1) == s2.charAt(j-1))
		        {
		            dp[i][j] = 1+dp[i-1][j-1];
		            max = Math.max(max,dp[i][j]);
		        }
		        else{
		            dp[i][j] = 0;
		        }
		    }
		}
		System.out.println(max);
	}
}
