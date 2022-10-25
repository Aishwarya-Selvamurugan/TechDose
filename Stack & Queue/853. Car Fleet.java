class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int l = speed.length;
        Stack<Double> s = new Stack<>();
        int arr[][] = new int[l][2];
        for(int i=0;i<l;i++)
        {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        for(int i=l-1;i>=0;i--)
        {
            double t = (target-arr[i][0])/(float)arr[i][1];
            // System.out.println(t);
            if(s.size() >= 1)
            {
                if(s.peek() < t)
                {
                    s.push(t);
                }
            }
            else
            {
                s.push(t);
            }
        }
        return s.size();
    }
}
