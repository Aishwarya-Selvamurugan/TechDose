class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        if(l<=1)
        {
            return l;
        }
        int max = 0,j=0,i=0;
        int res[] = new int[127];
            int m = 0;
            while(j<l)
            {
                if(res[s.charAt(j)] == 0)
                {
                    res[s.charAt(j)]=1;
                    m = j-i+1;
                    j++;
                    
                }
                else
                {
                    if(m > max)
                    {
                        max = m;
                    }
                    while(i<l && s.charAt(i) != s.charAt(j))
                    {
                        res[s.charAt(i)]=0;
                        i++;
                    }
                    if(i<l && s.charAt(i) == s.charAt(j))
                    {
                        res[s.charAt(i)]=0;
                        i++;
                    }
                }
            }
        return Math.max(max,m);
    }
}
