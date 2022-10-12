class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int l = s.length();
        int[] h = new int[l];
        int l1 = shifts.length;
        for(int i=0;i<l1;i++)
        {
            int st = shifts[i][0];
            int e = shifts[i][1];
            int d = shifts[i][2];
            if(d == 1)
            {
                h[st] += 1;
            }
            else
            {
                h[st] += -1;
                d = -1;
            }
            if(e < l-1)
            {
                h[e+1] += -1*d;
            }
        }
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<l;i++)
        {
            // System.out.println(-5%26);
            max += h[i];
            int res = ((s.charAt(i)-'a'+max)%26+'a');
            if(res < 97)
            {
                res += 26;
            }
            sb.append((char)(res));
        }
        return sb.toString();
    }
}
