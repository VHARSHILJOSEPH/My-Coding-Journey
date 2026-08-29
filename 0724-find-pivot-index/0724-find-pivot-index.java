class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int rightsum=0;
        for(int n:nums){
            rightsum+=n;
        }
        for(int i=0;i<nums.length;i++){
            if(leftsum==rightsum-nums[i]){
                return i;
            }
            leftsum+=nums[i];
            rightsum-=nums[i];

        }
        return -1;
        
    }
}