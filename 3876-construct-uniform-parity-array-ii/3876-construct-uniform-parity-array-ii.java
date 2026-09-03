class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd=Integer.MAX_VALUE;
        int even=Integer.MAX_VALUE;
        for(int n:nums1){
            if(n%2==0)  even=Math.min(n,even);
            else    odd=Math.min(n,odd);
        }
        if(odd==Integer.MAX_VALUE || even==Integer.MAX_VALUE)   return true;
        return even>=odd;   
    }
}