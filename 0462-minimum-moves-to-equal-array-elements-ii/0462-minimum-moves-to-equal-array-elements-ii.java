class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int mid=nums[n/2];
        int ans=0;
        for(int n1:nums){
            ans+=(Math.abs(n1-mid));
        }
        return ans;
        
    }
}