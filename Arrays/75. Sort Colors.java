class Solution {
    public void sortColors(int[] nums) {
        Sort(nums);
    }
    public static void Sort(int[] nums)
    {
        int h[] = new int[3];
        for(int i=0;i<nums.length;i++)
        {
            h[nums[i]]++;
        }
        int k = 0;
        for(int i=0;i<nums.length;i++)
        {
            while(h[k] == 0)
            {
                k++;
            }
            nums[i] = k;
            h[k]--;
        }
    }
}
