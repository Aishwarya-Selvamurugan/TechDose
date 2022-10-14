class Solution {
    public int longestSubsequence(String s, int k) {
        int l = s.length();
        int z = 0;
        int o = 0;
        int sum = 0;
        for(int i=l-1;i>=0;i--)
        {
            if(s.charAt(i) == '0')
            {
                z++;
            }
            else
            {
                sum += Math.pow(2,l-1-i);
                if(sum <= k)
                {
                    o++;
                }
            }
        }
        return o+z;
    }
}
