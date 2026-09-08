class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length<=2){
            return true;
        }
        int i=0;
        while(i<nums.length-1 && nums[i]==nums[i+1]){
            i++;
        }
        if(i==nums.length-1){
            return true;
        }
        if (nums[i] > nums[i+1]) {
            for (int k=i+1;k < nums.length-1; k++) {
                if (nums[k] < nums[k + 1]) {
                    return false;
                }
            }
        } else{
            for (int k=i+1;k < nums.length-1; k++) {
                if (nums[k] >nums[k + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}