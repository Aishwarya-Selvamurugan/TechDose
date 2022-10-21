class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        if(l1%2==0 && l2%2==0)
        {
            return 0;
        }
        int res1 = 0;
        for(int i=0;i<l1;i++)
        {
            res1^=nums1[i];
        }
        int res2=0;
        for(int i=0;i<l2;i++)
        {
            res2^=nums2[i];
        }
        if((l1%2 & l2%2)==1)
        {
            return res1^res2;
        }
        return (l1%2!=0)?res2:res1;
    }
}
