import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int e[][] = {{0,1},{2,3},{1,2},{0,4}};
		Node n[] = new Node[5];
		for(int i=0;i<5;i++)
		{
		    n[i] = new Node(-1,0);
		}
		
		for(int i=0;i<4;i++)
		{
		    if(union(e[i][0],e[i][1],n))
		    {
		        System.out.println("Forms Cycle");
		        return;
		    }
		}
		System.out.println("Does not form cycle");
	}
	static class Node{
	    int parent;
	    int rank;
	    Node(int p,int r)
	    {
	        this.parent = p;
	        this.rank = r;
	    }
	    
	}
	public static boolean union(int a,int b,Node[] n)
	{
	    int px = find(n,a);
	    int py = find(n,b);
	    
	    if(px == py)
	    {
	        return true; 
	    }
	    else{
	        if(n[py].rank == n[px].rank)
	        {
	            n[py].parent = px;
	            n[px].rank++;
	            
	        }
	        else
	        {
	            if(n[py].rank > n[px].rank)
	            {
	                n[px].parent = py;
	            }
	            else
	            {
	                n[py].parent = px;
	            }
	        }
	        return false;
	    }
	}
	public static int find(Node n[],int val)
	{
	    if(n[val].parent == -1)
	    {
	        return val;
	    }
	    return n[val].parent = find(n,n[val].parent);
	    
	}
}
