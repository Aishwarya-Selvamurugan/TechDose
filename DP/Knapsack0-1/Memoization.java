import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = {1,2,3};
		int p[] = {2,3,5};
		int c = 4;
		int mem[][] = new int[n.length+1][c+1];
		for(int[] m:mem)
		{
		    Arrays.fill(m,-1);
		}
		System.out.print(fun(n,p,c,n.length,mem));
	}
	public static int fun(int n[],int p[],int c,int i,int[][] mem)
	{
	    if(i==0 || c <= 0)
	    {
	        return 0;
	    }
	    if(mem[i-1][c] != -1)
	    {
	        return mem[i-1][c];
	    }
	    if(n[i-1] > c)
	    {
	        return mem[i-1][c] = fun(n,p,c,i-1,mem);
	    }
	    return mem[i-1][c] = Math.max(fun(n,p,c,i-1,mem),fun(n,p,c-n[i-1],i-1,mem)+p[i-1]);
	}
}
