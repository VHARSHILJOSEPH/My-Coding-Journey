class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        int n=nums.length;
        int l=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]<=nums[i+1]){
                l=i+1;
            }
            ans=Math.max(ans,i-l+2);
        }
        l=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                l=i+1;
            }
            ans=Math.max(ans,i-l+2);
        }
        return ans;
    }
}