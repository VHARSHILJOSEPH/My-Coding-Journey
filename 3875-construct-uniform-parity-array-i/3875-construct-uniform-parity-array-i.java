class Solution {
    public boolean uniformArray(int[] nums1) {
        int ans[]=new int [nums1.length];
        int odd=0;
        int even=0;
        for(int n:nums1){
            if(n%2==0 && even==0){
                even=n;
            }
            else if(n%2!=0 && odd==0){
                odd=n;
            }
        }
        if(even!=0 && odd==0)   return true;
        if(even==0 && odd!=0)   return true;
        if(even!=0 && odd!=0)   return true;
        return false;
    }
}