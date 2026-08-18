class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] fre=new int [51];
        for(int n:nums){
            fre[n]++;
        }
        int ans=-1,n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(k==n ||(fre[nums[i]]==1 && (k==1 || i==0 || i==n-1))){
                ans=Math.max(ans,nums[i]);
            }

        }
        return ans;

        
    }
}