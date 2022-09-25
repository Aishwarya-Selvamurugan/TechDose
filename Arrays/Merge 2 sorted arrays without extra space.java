import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] a = {2,5};
		int[] b = {1,3,8,10};
		int l1 = a.length;
		int l2 = b.length;
		for(int i=l2-1;i>=0;i--)
		{
		    int j;
		    int last = a[l1-1];
		    for(j=l1-2;j>=0&&b[i]<a[j];j--)
		    {
		        a[j+1] = a[j];
		    }
		    if(j!=l1-2||last > b[i])
		    {
		        a[j+1] = b[i];
		        b[i] = last;
		    }
		}
		for(int i=0;i<l1;i++)
		{
		    System.out.print(a[i]+ " ");
		}
		for(int i=0;i<l2;i++)
		{
		    System.out.print(b[i]+ " ");
		}
	}
}

// TC

// WC : O(m.n)  
