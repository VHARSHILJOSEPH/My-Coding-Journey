class Solution {
    public long[] resultArray(int[] nums, int k) {
        long []result=new long[k];
        long [] dp=new long[k];
        for(int n:nums){
            long[] next_dp=new long[k];
            next_dp[n%k]+=1;
            for(int r=0;r<k;r++){
                if(dp[r]>0){
                    int new_r=(int)(((long)r*n)%k);
                    next_dp[new_r]+=dp[r];
                }
            }
            dp=next_dp;
            for(int r=0;r<k;r++){
                result[r]+=dp[r];
            }
    
        }
        return result;
        
    }
}