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
		for(int i=n-1;i>0;i--)
		{
		    boolean isSwapped = false;
		    for(int j=0;j<i;j++)
		    {
		        if(a[j] > a[j+1])
		        {
		            int temp = a[j];
		            a[j] = a[j+1];
		            a[j+1] = temp;
		            isSwapped = true;
		        }
		    }
		    if(!isSwapped)
		    {
		        break;
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}
	}
}
