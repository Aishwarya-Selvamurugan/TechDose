class Solution {
    public int minimumTimeRequired(int[] jobs, int k) {
        int l = jobs.length;
        int min = 0;
        int max = 0;
        for(int i=0;i<l;i++)
        {
            min = Math.max(jobs[i],min);
            max += jobs[i];
        }
        int res = 0;
        while(min <= max)
        {
            int mid = min + (max-min)/2;
            System.out.println(min+" "+mid+" "+max);
            if(check(jobs,k,mid))
            {
                max = mid-1;
            }
            else
            {
                min = mid+1;
            }
        }
        return min;
    }
    boolean check(int jobs[],int k,int mid)
    {
        int t = mid;
        for(int i=0;i<jobs.length;i++)
        {
            if(jobs[i] <= mid)
            {
                mid-=jobs[i];
            }
            else
            {
                // return false;
                if(k==1)
                {
                    System.out.println("False");
                    return false;
                }
                mid = t;
                k--;
                i--;
            }
            System.out.println("mid "+mid);
        }
        return true;
    }
}
