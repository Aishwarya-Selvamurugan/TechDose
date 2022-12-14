import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i] = sc.nextInt();
		}
		List<Integer> lst = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		    lst.add(a[i]);
		    for(int j=lst.size()-1;j>0;j--)
		    {
		        if(lst.get(j) >= lst.get(j-1))
		        {
		            break;
		        }
		        Collections.swap(lst,j,j-1);
		    }
		}
		
		for(int i=0;i<n;i++)
		{
		    System.out.print(lst.get(i)+" ");
		}
	}
}

// Time Comlexity:
// ---------------
  
//  BC : O(N)  ==>Already in sorted order
//  WC : O(N^2) ==> Descending order
//  Ac : O(N^2)  ==> randomly arranged
