class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            min=nums[l]>nums[r]?nums[r]>min?min:nums[r]:nums[l]>min?min:nums[l];
            // min=Math.min(min,Math.min(nums[l],nums[r]));
            l++;
            r--;
        }
        return min;
        
        
    }
}