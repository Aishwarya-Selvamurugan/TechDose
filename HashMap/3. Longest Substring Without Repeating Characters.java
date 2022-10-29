class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int[] h = new int[127];
        int max = 0;
        for(int l=0,r=0;r<len;r++)
        {
            if(h[s.charAt(r)] == 0)
            {
                max = Math.max(r-l+1,max);
                h[s.charAt(r)]++;
            }
            else if(h[s.charAt(r)] == 1)
            {
                while(h[s.charAt(r)] == 1)
                {
                    
                    h[s.charAt(l)]--;
                    l++;
                }
                h[s.charAt(r)]++;
            }
        }
        return max==0?s.length():max;
    }
}
