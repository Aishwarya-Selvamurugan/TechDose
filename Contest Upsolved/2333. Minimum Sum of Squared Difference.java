class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[(int)1e5+1];
        int k = k1+k2;
        for(int i=0;i<n;i++)
        {
            diff[Math.abs(nums1[i]-nums2[i])]++;
        }
        // System.out.println(diff[0]+" "+diff[100000]);
        for(int i=(int)1e5;i>=0;i--)
        {
            int curr = diff[i];
            if(curr <= k)
            {
                if(i <= 1)
                {
                    return 0;
                }
                diff[i-1] += diff[i];
                diff[i] = 0;
                k -= curr;
            }
            else
            {
                if(i==0)
                {
                    return 0;
                }
                
                diff[i-1] += k;
                diff[i] -= k;
                break;
            }
        }
        // System.out.println(diff[0]+" "+diff[100000]);
        long res = 0;
        for(int i=1;i<=1e5;i++)
        {
            res += ((long)diff[i]) * (((long)i*(long)i));
            // System.out.println(res);
        }
        return res;
    }
}
