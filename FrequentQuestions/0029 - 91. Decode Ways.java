class Solution {
    public int numDecodings(String s) {
        int l = s.length();
        if(l == 0 || s.charAt(0) == '0')
        {
            return 0;
        }
        int[] res = new int[l+1];
        res[0] = 1;
        res[1] = 1;
        for(int i=2;i<=l;i++)
        {
            int a = Integer.valueOf(s.substring(i-1,i));
            int b = Integer.valueOf(s.substring(i-2,i));
            if(a >= 1 && a <= 9)
            {
                res[i] += res[i-1];
            }
            if(b >= 10 && b <= 26)
            {
                res[i] += res[i-2];
            }
        }
        return res[l];
    }
}
