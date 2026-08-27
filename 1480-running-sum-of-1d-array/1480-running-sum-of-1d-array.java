class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int pre=0;
        for(int i=0;i<n;i++){
            nums[i]+=pre;
            pre=nums[i];
        }
        return nums;
        
    }
}