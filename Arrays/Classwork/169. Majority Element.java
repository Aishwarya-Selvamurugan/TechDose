class Solution {
    public int majorityElement(int[] nums) {
        int l = nums.length;
        int majority = nums[0];
        int count=1;
        for(int i=1;i<l;i++){
            if(nums[i]==majority){
                count++;
            }
            else{
                count--;
                if(count==0){
                    majority=nums[i];
                    count=1;
                }
            }
        }
        return majority;
    }
}
