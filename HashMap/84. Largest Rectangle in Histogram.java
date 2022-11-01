class Solution {
    public int maximalRectangle(char[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        int max = 0;
        int dp[] = new int[c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i>0)
                {
                    dp[j] = matrix[i][j]!='0' ?(matrix[i][j]-'0') + (dp[j]):0;
                }
                else
                {
                    dp[j] = matrix[i][j]-'0';
                }
            }
            int m = largestRectangleArea(dp);
            max = Math.max(m,max);
        }
        return max;
        
    }
    public int largestRectangleArea(int[] heights) {
        int l = heights.length;
        int left[] = new int[l];
        int right[] = new int[l];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<l;i++)
        {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                left[i] = 0;
            }
            else
            {
                left[i] = s.peek()+1;
            }
            s.push(i);
        }
        s.clear();
        for(int i=l-1;i>=0;i--)
        {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                right[i] = l-1;
            }
            else
            {
                right[i] = s.peek()-1;
            }
            s.push(i);
        }
        int max = 0;
        for(int i=0;i<l;i++)
        {
            max = Math.max(max,heights[i]*(right[i]-left[i]+1));
        }
        return max;
    }
}
