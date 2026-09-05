class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int SufMin[]=new int [n];
        SufMin[n - 1] = nums[n - 1];
        for(int i=n-2;i>=0;i--){
            SufMin[i]=Math.min(SufMin[i + 1],nums[i]);
        }
        int max1=0;
        for(int i=0;i<n;i++){
            if(max1<nums[i])    max1=nums[i];
            if(max1-SufMin[i]<=k)   return i;
        }
        return -1;       
        
    }
}