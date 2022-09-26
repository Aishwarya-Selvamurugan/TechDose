import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a[] = {2,4,6,8};
		int b[] = {1,5,7,8};
		int res = 0;
		int j=0;
		for(int i=0;i<b.length;i++)
		{
		    while(i<b.length && j<a.length && b[i] >= a[j])
		    {
		        j++;
		    }
		    res+=(j-a.length);
		}
		System.out.println(res);
	}
}

// TC

// O(m+n)
