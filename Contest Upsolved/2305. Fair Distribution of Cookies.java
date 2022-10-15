class Solution {
    int res = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        fun(cookies,0,k,new int[k]);
        return res;
    }
    public void fun(int[] cookies,int curr,int k,int[] ch)
    {
        if(curr == cookies.length)
        {
            int max = 0;
            for(int i=0;i<k;i++)
            {
                max = Math.max(ch[i],max);
            }
            res = Math.min(res,max);
            return;
        }
        for(int i=0;i<k;i++)
        {
            ch[i] += cookies[curr];
            fun(cookies,curr+1,k,ch);
            ch[i] -= cookies[curr];
        }
    }
}
