class NumArray {
    int res[];
    public NumArray(int[] nums) {
        res = new int[nums.length];
        res[0] = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            res[i] = nums[i]+res[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left!=0){
        return res[right]-res[left-1];
        }
        return res[right];
    }
    
}
