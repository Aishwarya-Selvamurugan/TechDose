import java.util.*;
class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mask = 1;
		int count = 0;
		while(n!=0)
		{
		    if((n&mask) != 0)
		    {
		        System.out.println(count);
		        return;
		    }
		    count++;
		    n>>=1;
		}
		System.out.println("No set bit for 0");
	}
}
