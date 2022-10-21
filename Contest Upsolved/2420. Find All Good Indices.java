class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> lst = new ArrayList<>();
        int l = nums.length;
        int a[] = new int[l];
        int b[] = new int[l];
        a[0] = 1;
        for(int i=1;i<l-k;i++)
        {
            if(nums[i] <= nums[i-1])
            {
                a[i] = a[i-1]+1;
            }
            else
            {
                a[i] = 1;
            } 
        }
        b[l-1] = 1;
        for(int i=l-2;i>=k;i--)
        {
            if(nums[i] <= nums[i+1])
            {
                b[i] = b[i+1]+1;
            }
            else
            {
                b[i] = 1;
            }
        }
        // for(int i=0;i<l;i++)
        // {
        //     System.out.print(a[i]+" ");
        // }
        // System.out.println();
        // for(int i=0;i<l;i++)
        // {
        //     System.out.print(b[i]+" ");
        // }
        for(int i=k;i<l-k;i++)
        {
            if(a[i-1] >= k && b[i+1] >= k)
            {
                lst.add(i);
            }
        }
        return lst;
    }
}
