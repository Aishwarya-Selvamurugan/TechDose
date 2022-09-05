import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
		Factor1(num);
		System.out.println();
		Factor2(num);
	}
	public static void Factor1(int n)//TC-->O(n)
	{
	    List<Integer> list = new ArrayList<>();
	    for(int i=1;i<=n;i++)
	    {
	        if(n%i==0)
	        {
	            list.add(i);
	        }
	    }
	    for(int i:list)
	    {
	        System.out.print(i+" ");
	    }
	}
	public static void Factor2(int n)//TC-->O(root(n))
	{
	    List<Integer> list = new ArrayList<>();
	    for(int i=1;i*i<=n;i++)
	    {
	        if(n%i==0)
	        {
	            list.add(i);
	            if(i != n/i){
	            list.add(n/i);
	            }
	        }
	    }
	    Collections.sort(list);
	    for(int i:list)
	    {
	        System.out.print(i+" ");
	    }
	}
}
