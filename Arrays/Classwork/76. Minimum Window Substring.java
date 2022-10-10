class Solution {
    public String minWindow(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        int c[] = new int[127];
        for(int i=0;i<l2;i++)
        {
            c[t.charAt(i)]++;
        }
        int start = 0,min = Integer.MAX_VALUE,cnt = l2;
        for(int l=0,r=0;r<l1;r++)
        {
            c[s.charAt(r)]--;
            if(c[s.charAt(r)] >= 0)
            {
                cnt--;
            }
            while(cnt == 0)
            {
                c[s.charAt(l)]++;
                if(c[s.charAt(l)]>0)
                {
                    if(r-l+1 < min)
                    {
                        start = l;
                        min = r-l+1;
                    }
                    cnt++;
                }
                l++;
            }
        }
        return min == Integer.MAX_VALUE?"":s.substring(start,start+min);
    }
}
