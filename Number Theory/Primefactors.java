import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n;
		for(int i=2;i*i<=n;i++)
		{
		    while(x%i==0)
		    {
		        x/=i;
		        System.out.println(i+" ");
		    }
		}
		if(x>2)
		{
		    System.out.println(x);
		}
	}
}
