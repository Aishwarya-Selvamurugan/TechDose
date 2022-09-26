import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int nums[] = {5,3,-1,7};
		int n = nums.length;
        List<Integer> s = generate(nums,0,n/2);
        List<Integer> e = generate(nums,n/2,n);
        
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
        int size = (int)Math.pow(2,nums.length/2);
        List<Integer> l = new ArrayList<>();
        int diff = 0;
        if(a!=0)
        {
            diff = nums.length/2;
        }
        for(int i=0;i<size;i++)
        {
            int sum = 0;
            int mask = 1;
            for(int I=0;I<nums.length;I++)
            {
                if((mask&i)>0)
                {
                    sum+=nums[I+diff];
                }
                mask<<=1;
            }
            l.add(sum);
        }
        return l;
    }
}
