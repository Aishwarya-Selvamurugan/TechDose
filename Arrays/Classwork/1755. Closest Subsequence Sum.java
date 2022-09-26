class Solution {
    public int minAbsDifference(int[] nums, int goal) {
        int n = nums.length;
        List<Integer> s = generate(nums,0,n/2-1,n);
        List<Integer> e = generate(nums,n/2,n-1,n);
        Collections.sort(e);
        return CSS(s,e,goal);
    }
    public static List<Integer> generate(int[] nums, int low, int high, int n) {
        List<Integer> res = new ArrayList<>();
        int totEle = (high - low) + 1, index = 0;
        int[] arr = new int[totEle];
        for (int i = low; i <= high; i++) {
            arr[index++] = nums[i];
        }
        for (int i = 0; i < (1 << totEle); i++) {
            int sum = 0;
            for (int j = 0; j < totEle; j++) {
                if ((i & (1 << j)) > 0) {
                    sum += arr[j];
                }
            }
            res.add(sum);
        }
        return res;
    }
    int CSS(List<Integer> s,List<Integer> e,int k)
    {
        int r = Integer.MAX_VALUE;
        for(int i=0;i<s.size();i++)
        {
            int y = k-s.get(i);
            int l = 0;
            int h = e.size()-1;
            int res1 = Integer.MIN_VALUE;
            int res2 = Integer.MAX_VALUE;
            while(l<=h)
            {
                int mid = l+(h-l)/2;
                if(e.get(mid) == y)
                {
                    return 0;
                }
                else if(e.get(mid) < y)
                {
                    res1 = Math.max(res1,e.get(mid));
                    l = mid+1;
                }
                else
                {
                    res2 = Math.min(res2,e.get(mid));
                    h = mid-1;
                }
            }
            int res = 0;
            if(Math.abs(res1-y) < Math.abs(res2-y))
            {
                res = Math.abs(res1-y);
            }
            else
            {
                res = Math.abs(res2-y);
            }
            r = Math.min(res,r);
        }
        return r;
    }
}
