import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "ABCDGHIJKLM";
		String s2 = "AEDFHRIJKOM";
		int mem[][] = new int[s1.length()+1][s2.length()+1];
		for(int[] mm:mem)
		{
		    Arrays.fill(mm,-1);
		}
		System.out.println(LCSubsequence(s1,s1.length(),s2,s2.length(),mem));
	}
	public static int LCSubsequence(String s1,int m,String s2,int n,int[][] mem)
	{
	    if(m == 0 || n == 0)
	    {
	        return 0;
	    }
	    if(mem[m][n] != -1)
	    {
	        return mem[m][n];
	    }
	    if(s1.charAt(m-1) == s2.charAt(n-1))
	    {
	        return mem[m][n] = 1+LCSubsequence(s1,m-1,s2,n-1,mem);
	    }
	    return mem[m][n] = Math.max(LCSubsequence(s1,m,s2,n-1,mem),LCSubsequence(s1,m-1,s2,n,mem));
	}
}
