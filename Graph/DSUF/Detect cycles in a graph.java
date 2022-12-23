import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int e[][] = {{0,1},{0,3},{2,3}};
		int p[] = new int[4];
		Arrays.fill(p,-1);
		for(int i=0;i<3;i++)
		{
		    if(union(e[i][0],e[i][1],p))
		    {
		        System.out.println("Forms Cycle");
		        return;
		    }
		}
		System.out.println("Does not form cycle");
	}
	public static boolean union(int a,int b,int[] p)
	{
	    int px = find(p,a);
	    int py = find(p,b);
	    
	    if(px == py)
	    {
	        return true; 
	    }
	    else{
	        p[px] = py;
	        return false;
	    }
	}
	public static int find(int p[],int val)
	{
	    return p[val] == -1?val:find(p,p[val]);
	}
}
