import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mask = 1,count=0;
		while(n!=0)
		{
		    if((mask&n) != 0)
		    {
		        count++;
		    }
		    n>>=1;
		}
		System.out.println(count);
	}
}

// Integer.bitCount(n) ---> built-in fn
