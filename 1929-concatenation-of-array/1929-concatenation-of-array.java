class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int []ans =new int [n+n];
        int i=0;
        while(i<n+n){
            ans[i]=nums[i%n];
            i++;
        }
        return ans;
        
    }
}