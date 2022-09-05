import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
		System.out.println(isPrime1(num)?"Prime":"Not Prime");
		System.out.println(isPrime2(num)?"Prime":"Not Prime");
	}
	public static boolean isPrime1(int n)//TC-->O(n)
	{
	    for(int i=2;i<n;i++)
	    {
	        if(n%i==0)
	        {
	            return false;
	        }
	    }
	    return true;
	}
	public static boolean isPrime2(int n)//TC-->O(root(n))
	{
	    for(int i=2;i*i<=n;i++)
	    {
	        if(n%i==0)
	        {
	            return false;
	        }
	    }
	    return true;
	}
}
