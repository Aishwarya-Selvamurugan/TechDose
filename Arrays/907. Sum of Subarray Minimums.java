class Solution {
    public int sumSubarrayMins(int[] arr) {
        int l = arr.length;
        int left[] = new int[l];
        int right[] = new int[l];
        Stack s = new Stack<>();
        for(int i=0;i<l;i++)
        {
            while(!s.isEmpty() && arr[(int)s.peek()] > arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                left[i] = 0;
            }
            else
            {
                left[i] = (int)s.peek()+1;
            }
            s.push(i);
        }
        // for(int i=0;i<l;i++)
        // {
        //     System.out.println(left[i]);
        // }
        Stack s1 = new Stack<>();
        for(int i=l-1;i>=0;i--)
        {
            while(!s1.isEmpty() && arr[(int)s1.peek()] >= arr[i])
            {
                s1.pop();
            }
            if(s1.isEmpty())
            {
                right[i] = l-1;
            }
            else
            {
                right[i] = (int)s1.peek()-1;
            }
            s1.push(i);
        }
        // for(int i=0;i<l;i++)
        // {
        //     System.out.println(right[i]);
        // }
        long res = 0;
        for(int i=0;i<l;i++)
        {
            long lt = (i-left[i]+1);
            long rt = (right[i]-i+1);
            res = (res+lt*rt*arr[i])%1000000007;
            // System.out.println(lt+" "+rt);
        }
        return (int)res;
    }
}
