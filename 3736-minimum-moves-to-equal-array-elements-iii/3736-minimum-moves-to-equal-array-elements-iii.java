class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int sum=0;
        for(int n:nums){
            max=Math.max(n,max);
            sum+=n;
        }
        return nums.length*max-sum;
    }

}