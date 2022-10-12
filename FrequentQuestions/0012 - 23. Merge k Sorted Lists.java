class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length)
        {
            return findMedianSortedArrays(nums2,nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        if(m == 0)
        {
            if(n%2!=0)
            {
                return nums2[n/2];
            }
            return (double)(nums2[n/2]+nums2[n/2-1])/2;
        }
        if(n == 0)
        {
            if(m%2!=0)
            {
                return nums1[m/2];
            }
            return (double)(nums1[m/2]+nums1[m/2-1])/2;
        }
        int low = 0;
        int high = m;
        
        while(low<=high)
        {
            int partitionX = (low+high)/2;
            int partitionY = (m+n+1)/2-partitionX;
            int maxLX = (partitionX == 0)?Integer.MIN_VALUE:nums1[partitionX-1];
            int minRY = (partitionY == n)?Integer.MAX_VALUE:nums2[partitionY];
            
            int maxLY = (partitionY == 0)?Integer.MIN_VALUE:nums2[partitionY-1];
            int minRX = (partitionX == m)?Integer.MAX_VALUE:nums1[partitionX];
            if(maxLX <= minRY && maxLY <= minRX)
            {
                
                if((m+n)%2!=0)
                {
                    return Math.max(maxLX,maxLY);
                }
                else
                {
                    return (double)(Math.max(maxLX,maxLY)+Math.min(minRY,minRX))/2;
                }
            }
            else if(maxLX > minRY)
            {
                high = partitionX-1;
                
            }
            else
            {
                low = partitionX+1;
            }
        }
        return 0;
    }
}
