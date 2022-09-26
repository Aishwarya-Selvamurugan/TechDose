import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int nums[] = {5,3,-1,7};
		int n = nums.length;
        List<Integer> s = generate(nums,0,n/2-1);
        List<Integer> e = generate(nums,n/2,n-1);
        
        Collections.sort(e);
        // for(int i=0;i<s.size();i++)
        // {
        //     System.out.print(e.get(i)+" ");
        // }
		System.out.println(MaxSubset(s,e,13));
	}
	public static int MaxSubset(List<Integer> s,List<Integer> e,int k)
    {
        int res = 0;
        int max = 0;
        for(int i=0;i<s.size();i++)
        {
            int y = k-s.get(i),r=Integer.MIN_VALUE;
            int l = 0;
            int h = e.size()-1;
            while(l<=h)
            {
                int mid = l+(h-l)/2;
                if(e.get(mid) <= y)
                {
                    r=Math.max(r,e.get(mid));
                    l=mid+1;
                }
                else
                {
                    h=mid-1;
                }
            }
            if(r+s.get(i)<=k){
                // System.out.println(s.get(i)+" "+r+" "+(r+s.get(i)));
                max = Math.max(max,r+s.get(i));
            }
        }
        return max;
    }
    public static List<Integer> generate(int nums[],int a,int b)
    {
        int size = b-a+1;
        List<Integer> l = new ArrayList<>();
	int arr[] = new int[size];
	int k = 0;
	for(int i=a;i<=b;i++)
	{
		arr[k++] = nums[i];
	}
        for(int i=0;i<(1<<size);i++)
	{
		int sum = 0;
		for(int j=0;j<size;j++)
		{
			if((i&(1<<j))>0)
			{
				sum+=arr[j];
			}
		}
		l.add(sum);
	}
        return l;
    }
}
