class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        List<Integer> nodd = new ArrayList<>();
        List<Integer> neven = new ArrayList<>();
        List<Integer> todd = new ArrayList<>();
        List<Integer> teven = new ArrayList<>();
        int l = nums.length;
        for(int i=0;i<l;i++)
        {
            if(nums[i]%2!= 0)
            {
                nodd.add(nums[i]);
            }
            else
            {
                neven.add(nums[i]);
            }
        }
        for(int i=0;i<l;i++)
        {
            if((target[i])%2!= 0)
            {
                todd.add(target[i]);
            }
            else
            {
                teven.add(target[i]);
            }
        }
        Collections.sort(nodd);
        Collections.sort(neven);
        Collections.sort(todd);
        Collections.sort(teven);
        // for(int i=0;i<todd.size();i++)
        // {
        //     System.out.println(todd.get(i));
        // }
        long o = funCheck(nodd,todd);
        long e = funCheck(neven,teven);
        return (o+e)>>2;
    }
    public long funCheck(List<Integer> l1,List<Integer> l2)
    {
        int l = l1.size();
        long res = 0;
        for(int i=0;i<l;i++)
        {
            // System.out.print(l1.get(i)+" ");
            // System.out.print(l2.get(i)+" ");
            res += Math.abs(l1.get(i)-l2.get(i));
            // System.out.println();
        }
        // System.out.println(res);
        return res;
    }
}
