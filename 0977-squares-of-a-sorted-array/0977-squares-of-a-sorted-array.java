class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int n=nums.length-1;
        int ans[]=new int[n+1];
        while(l<=r){
            int lsq=nums[l]*nums[l];
            int rsq=nums[r]*nums[r];
            if(lsq>rsq){
                ans[n--]=lsq;
                l++;
            }
            else{
                ans[n--]=rsq;
                r--;
            }

        }
        return ans;        
    }
}