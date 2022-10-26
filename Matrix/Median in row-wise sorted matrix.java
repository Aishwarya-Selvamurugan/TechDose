import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = {{1,3,5},{2,6,9},{3,6,9}};
        int n = A.length, m = A[0].length;
        int min = 0;
        int max = Integer.MAX_VALUE;
        int res = 0;
        while(min <= max)
        {
            int mid = min + (max-min)/2;
            int c = 0;
            for(int i=0; i<n; i++) c += funCheckCount(A[i], mid);
            // System.out.println(c);
            if(c <= (n*m)/2)
            {
                min = mid+1;
                res = mid;
            }
            else
            {
                max = mid-1;
            }
        }
         System.out.println(res);
//        return res;
    }
    public static int funCheckCount(int[] a,int x)
    {
        int low = 0, high = a.length-1;
        int size = 0;
        while(low <= high){
            int mid = low +(high - low) / 2;
            if(a[mid] < x){
                low = mid + 1;
                size = mid + 1;
            }else high = mid - 1;
        }
         System.out.println(size);
        return size;
    }
}
