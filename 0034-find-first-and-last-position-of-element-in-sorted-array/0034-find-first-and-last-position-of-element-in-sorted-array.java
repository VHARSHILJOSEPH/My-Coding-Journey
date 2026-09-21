class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int lmax=-1;
        int rmax=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                l=mid+1;
                rmax=mid;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        l=0;
        r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                r=mid-1;
                lmax=mid;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return new int []{lmax,rmax};
        
    }
}