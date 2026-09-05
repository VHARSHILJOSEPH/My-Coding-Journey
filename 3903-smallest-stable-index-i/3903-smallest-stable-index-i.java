class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length-1;
        int SufMin[]=new int [nums.length];
        SufMin[n] = nums[n];
        for(int i=n-1;i>=0;i--){
            SufMin[i]=Math.min(SufMin[i + 1],nums[i]);
        }
        int max1=0;
        for(int i=0;i<=n;i++){
            if(max1<nums[i])    max1=nums[i];
            if(max1-SufMin[i]<=k)   return i;
        }
        return -1;       
        
    }
}