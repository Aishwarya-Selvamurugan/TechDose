import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = {1,2,3};
		int p[] = {2,3,5};
		int c = 4;
		System.out.print(fun(n,p,c,n.length));
	}
	public static int fun(int n[],int p[],int c,int i)
	{
	    if(i==0 || c <= 0)
	    {
	        return 0;
	    }
	    if(n[i-1] > c)
	    {
	        return fun(n,p,c,i-1);
	    }
	    return Math.max(fun(n,p,c,i-1),fun(n,p,c-n[i-1],i-1)+p[i-1]);
	}
}
