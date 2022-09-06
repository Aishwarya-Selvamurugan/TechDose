import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean a[] = new boolean[n+1];
		for(int i=2;i*i<=n;i++)
		{
		    if(a[i] == false)
		    {
		        for(int j=i+i;j<=n;j+=i)
		        {
		            a[j] = true;
		        }
		    }
		}
		for(int i=2;i<=n;i++)
		{
		    if(a[i] == false)
		    {
		        System.out.print(i+" ");
		    }
		}
	}
}
