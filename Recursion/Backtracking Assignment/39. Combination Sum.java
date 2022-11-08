class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<Integer> l = new ArrayList<>();
        sumC(candidates,target,0,0,l);
        return res;
    }
    public void sumC(int a[],int target,int i,int sum,List<Integer> l)
    {
        if(target == 0)
        {
            res.add(new ArrayList<>(l));
            return;
        }
        if(target < 0)
        {
            return;
        }
        if(i == a.length)
        {
            return;
        }
        sumC(a,target,i+1,sum,l);
        l.add(a[i]);
        sumC(a,target-a[i],i,sum,l);
        l.remove(l.size()-1);
    }
}


/*<=======================================================================================================>*/
    
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Sum(candidates,target,0,0,new ArrayList<>());
        return res;
    }
    public void Sum(int[] nums,int target,int sum,int index,List<Integer> l)
    {
        if(index == nums.length)
        {
            return;
        }
        if(sum == target)
        {
            // System.out.println(l);
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            if(target >= sum)
            {
                l.add(nums[i]);
                Sum(nums,target,sum+nums[i],i,l);
                l.remove(l.size()-1);
            }
        }
    }
}    
