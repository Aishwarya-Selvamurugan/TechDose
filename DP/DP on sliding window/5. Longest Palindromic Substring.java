class Solution {
    public String longestPalindrome(String s) {
        int l = s.length();
        String res = "";
        int dp[][] = new int[l][l];
        int max = 0;
        for(int i=0;i<l;i++)
        {
            int c = i;
            for(int j=0;j<l-i;j++,c++)
            {
                if(c == j)
                {
                    dp[j][c] = 1;
                }
                else if(s.charAt(j) == s.charAt(c))
                {
                    if(i == 1)
                    {
                        dp[j][c] = 2;
                    }
                    else if(dp[j+1][c-1] > 0){
                    dp[j][c] = dp[j+1][c-1] + 2;
                    }
                }
                else
                {
                    dp[j][c] = 0;
                }
                if(max < dp[j][c])
                {
                    max = dp[j][c];
                    res = s.substring(j,c+1);
                }
            }
        }
        System.out.println(max);
        return res;
    }
}
