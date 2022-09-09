// Method 1:

// LCM(a,b) = (a*b)/GCD(a,b)
// GCD(a,b) = (a*b)/LCM(a,b)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(a/gcd(a,b)*b);
	}
	public static int gcd(int a,int b)
	{
	    if(a == 0)
	    {
	        return b;
	    }
	    return gcd(b%a,a);
	}
}

//--------------------------------------------------

// METHODD :2

// Prime Factorization Method  
  
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = 1;
		int i = 2;
		while(a!=1 && b!=1)
		{
		    while(a%i==0 && b%i==0)
		    {
		        a/=i;
		        b/=i;
		        res *= i;
		    }
		    while(a%i==0)
		    {
		        a/=i;
		        res *= i;
		    }
		    while(b%i==0)
		    {
		        b/=i;
		        res *= i;
		    }
		    i++;
		}
		System.out.print(res*a*b);
	}
}
