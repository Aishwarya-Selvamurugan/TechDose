class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int min = matrix[0][0],max = matrix[n-1][n-1];
        
        while(min != max)
        {
            int mid = min+(max-min)/2;
            int count = Count(matrix,mid);
            if(count < k)
            {
                min = mid+1;
            }
            else
            {
                max = mid;
            }
        }
        return min;
    }
    
    public int Count(int a[][],int mid)
    {
        int r = 0;
        int count = 0;
        int c = a.length-1;
        while(r<a.length && c>=0)
        {
            if(a[r][c] <= mid)
            {
                count+=c+1;
                r++;
            }
            else
            {
                c--;
            }
        }
        return count;
    }
}
