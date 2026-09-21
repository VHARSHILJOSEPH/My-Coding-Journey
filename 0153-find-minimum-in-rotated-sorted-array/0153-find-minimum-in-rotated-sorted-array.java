class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            min=Math.min(min,Math.min(nums[l],nums[r]));
            l++;
            r--;
        }
        return min;
        
        
    }
}