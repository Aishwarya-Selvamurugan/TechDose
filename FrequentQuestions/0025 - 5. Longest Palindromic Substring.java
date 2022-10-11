class Solution {
    public String longestPalindrome(String s) {
        int l = s.length();
        String res = null;
        int a[][] = new int[l][l];
        int max = 0;
        for(int i=0;i<l;i++)
        {
            int c = i;
            for(int j=0;j<l-i;j++,c++)
            {
                if(c==j)
                {
                    a[j][c] = 1;
                }
                else if(s.charAt(j) != s.charAt(c))
                {
                    a[j][c] = 0;
                }
                else if(i == 1)
                {
                    a[j][c] = 2;
                }
                else
                {
                    if(a[j+1][c-1] > 0)
                    {
                        a[j][c] = a[j+1][c-1]+2;
                    }
                }
                if(a[j][c] > max)
            {
                max = a[j][c];
                res = s.substring(j,c+1);
            }
            }
        }
            // for(int i=0;i<l;i++)
            // {
            // for(int j=0;j<l;j++)
            // {
            //     System.out.print(a[i][j]+" ");
            // }
            // System.out.println();
        // }
        return res;
    }
}
