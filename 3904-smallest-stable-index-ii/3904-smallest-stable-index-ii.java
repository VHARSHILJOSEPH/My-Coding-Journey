class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length-1;
        int sufixmin[]=new int[nums.length];
        sufixmin[n]=nums[n];
        for(int i=n-1;i>=0;i--){
            sufixmin[i]=Math.min(sufixmin[i+1],nums[i]);                      
        }
        int max1=0;
        for(int i=0;i<nums.length;i++){
            if(max1<nums[i])    max1=nums[i];
            if(max1-sufixmin[i]<=k) return i;

        }
        return -1;
        
    }
}