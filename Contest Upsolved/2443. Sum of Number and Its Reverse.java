class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        int i = 0;
        int j = num;
        while(i <= j)
        {
            if(i == reverse(j))
            {
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
    public int reverse(int nums)
    {
        int res = 0;
        while(nums > 0)
        {
            int a = nums%10;
            res = (res*10)+a;
            nums/=10;
        }
        return res;
    }
}
