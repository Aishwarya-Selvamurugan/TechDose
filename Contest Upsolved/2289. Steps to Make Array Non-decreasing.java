class Solution {
    public int totalSteps(int[] nums) {
        int l = nums.length;
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        int max = 0;
        int c = 0;
        for(int i=l-1;i>=0;i--)
        {
            c = 0;
            while(!stack.isEmpty() && stack.peek().getKey() < nums[i])
            {
                c = Math.max(c+1,stack.peek().getValue());
                stack.pop();
            }
            System.out.println(c);
            max = Math.max(c,max);
            stack.push(new Pair<>(nums[i],c));
            
        }
        
        return max;
    }
}
