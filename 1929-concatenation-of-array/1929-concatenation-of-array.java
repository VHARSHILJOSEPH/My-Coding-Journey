class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int []ans =new int [n*2];
        int i=0;
        while(i<n*2){
            ans[i]=nums[i%n];
            i++;
        }
        return ans;
        
    }
}