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
		a = RadixSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static int[] RadixSort(int[] a)
	{
	    int max = 0;
	    int l = a.length;
	    for(int i=0;i<l;i++)
	    {
	        max = Math.max(a[i],max);
	    }
	    int noOfDigits = (int)(Math.log(max)/Math.log(10));
	    for(int i=0;i<=noOfDigits;i++)
	    {
	        int h[] = new int[10];
	        for(int j=0;j<l;j++)
	        {
	            h[(a[j]/(int)Math.pow(10,i))%10]++;
	        }
	        for(int j=1;j<10;j++)
	        {
	            h[j] = h[j-1]+h[j];
	        }
	        int res[] = new int[l];
	        for(int j=l-1;j>=0;j--)
	        {
	            int index = (a[j]/(int)Math.pow(10,i))%10;
	            res[--h[index]] = a[j];
	        }
	        a = res;
	    }
	    return a;
	}
}
