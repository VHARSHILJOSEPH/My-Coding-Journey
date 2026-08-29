class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int tosum=0;
        for(int n:nums){
            tosum+=n;
        }
        for(int i=0;i<nums.length;i++){
            int rightsum=tosum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
        
    }
}