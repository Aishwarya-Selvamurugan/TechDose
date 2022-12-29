import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "CAAAXYZPXYZP";
		String s2 = "DAAAXYZP";
		System.out.println(LCSubstring(s1,s1.length(),s2,s2.length(),0));
	}
	public static int LCSubstring(String s1,int m,String s2,int n,int count)
	{
	    if(m == 0 || n == 0)
	    {
	        return count;
	    }
	    if(s1.charAt(m-1) == s2.charAt(n-1))
	    {
	        count = LCSubstring(s1,m-1,s2,n-1,count+1);
	    }
	    count = Math.max(count,Math.max(LCSubstring(s1,m,s2,n-1,0),LCSubstring(s1,m-1,s2,n,0)));
	    return count;
	}
}
