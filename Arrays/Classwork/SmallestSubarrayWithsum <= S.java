import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = {1,5,2,1,3,6,1,2,1,1,1,0,10,0,1,1,1};
		int l = n.length;
		int target = 6;
		int j = 0;
		int sum = 0;
		int res = 0;
		for(int i=0;i<l;i++)
		{
		    sum += n[i];
		    while(sum > target)
		    {
		        sum-=n[j];
		        j++;
		    }
		    res = Math.max(res,i-j+1);
		}
		System.out.println(res);
	}
}
