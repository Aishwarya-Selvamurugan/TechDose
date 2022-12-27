import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e[][] = {{0,1,6},{0,2,7},{1,4,5},{4,1,-2},{1,3,-4},{1,2,8},{2,4,-3},{2,3,9},{3,4,7},{3,0,2}};
		int parent[] = new int[5];
		int weight[] = new int[5];
		Arrays.fill(weight,Integer.MAX_VALUE);
		Arrays.fill(parent,-1);
		weight[0] = 0;
		int count = 0;
		for(int i=0;i<5-1;i++)//relaxing
		{
		    boolean flag = true;
		    for(int j=0;j<e.length;j++)
		    {
		        if(weight[e[j][1]] > weight[e[j][0]]+e[j][2])
		        {
		            flag = false;
		            weight[e[j][1]] = weight[e[j][0]]+e[j][2];
		            parent[e[j][1]] = e[j][0];
		        }
		    }
		    count++;
		    if(flag)
		    {
		        break;
		    }
		}
		for(int i=0;i<5;i++)
		{
		    System.out.println(i+" "+parent[i]);
		}
		if(count < 5-1)
		{
		    System.out.println("No Negative Edge Weight cylce formed");
		}
		else
		{
		    boolean flag = true;
		    for(int j=0;j<e.length;j++)
		    {
		        if(weight[e[j][1]] > weight[e[j][0]]+e[j][2])
		        {
		            flag = false;
		            weight[e[j][1]] = weight[e[j][0]]+e[j][2];
		            parent[e[j][1]] = e[j][0];
		        }
		    }
		    if(flag)
		    {
		        System.out.println("No Negative Edge Weight cylce formed");
		    }
		    else{
		        System.out.println("Negative Edge Weight cylce formed");
		    }
		}
	}
}
