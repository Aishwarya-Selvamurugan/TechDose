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
		for(int i=0;i<n-1;i++)
		{
		    int Index = i;
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[Index] > a[j])
		        {
		            Index = j;
		        }
		    }
		    int temp = a[Index];
		    a[Index] = a[i];
		    a[i] = temp;
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}
	}
}

// Time Comlexity
// --------------

// BC : O(N^2)
// WC : O(N^2)	
