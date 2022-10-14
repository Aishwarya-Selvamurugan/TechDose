class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int l = nums1.length;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<l;i++)
        {
            sum1 += nums1[i];
            sum2 += nums2[i];
        }
        int diff[] = new int[l];
        for(int i=0;i<l;i++)
        {
            diff[i] = nums2[i]-nums1[i];
        }
        int max = 0;
        int curr = 0;
        for(int i=0;i<l;i++)
        {
            curr += diff[i];
            if(curr < 0)
            {
                curr = 0;
            }
            max = Math.max(curr,max);
        }
        sum1 += max;
        
        for(int i=0;i<l;i++)
        {
            diff[i] = nums1[i]-nums2[i];
        }
        max = 0;
        curr = 0;
        for(int i=0;i<l;i++)
        {
            curr += diff[i];
            if(curr < 0)
            {
                curr = 0;
            }
            max = Math.max(curr,max);
        }
        sum2 += max;
        return Math.max(sum2,sum1);
    }
}
