class Solution {
    public int majorityElement(int[] nums) {
        int l = nums.length;
        int mask = 1;
        int res = 0;
        
        for(int i=0;i<31;i++)
        {
            int count = 0;
            for(int j=0;j<l;j++)
            {
                int c = nums[j]&mask;
                if(c != 0)
                {
                    count++;
                }
                System.out.print(c+" ");
            }
            mask<<=1;
            if(count >= l/2)
            {
                res += Math.pow(2,i);
            }
        }
        return res;
    }
}
