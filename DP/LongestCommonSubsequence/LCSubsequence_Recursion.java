import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "ABCDGH";
		String s2 = "AEDFHR";
		System.out.println(LCSubsequence(s1,s1.length(),s2,s2.length()));
	}
	public static int LCSubsequence(String s1,int m,String s2,int n)
	{
	    if(m == 0 || n == 0)
	    {
	        return 0;
	    }
	    if(s1.charAt(m-1) == s2.charAt(n-1))
	    {
	        return 1+LCSubsequence(s1,m-1,s2,n-1);
	    }
	    return Math.max(LCSubsequence(s1,m,s2,n-1),LCSubsequence(s1,m-1,s2,n));
	}
}
