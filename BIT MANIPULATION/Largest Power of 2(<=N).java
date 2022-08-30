import java.util.*;
class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<<1 <= n)
		{
		    i<<=1;
		}
		System.out.println(i);
	}
}
