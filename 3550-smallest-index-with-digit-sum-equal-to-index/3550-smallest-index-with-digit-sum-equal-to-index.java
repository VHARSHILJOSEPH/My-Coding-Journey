class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=0;
            int n1=nums[i];
            while(n1>0){
                n+=n1%10;
                n1/=10;
            }
            if(n==i){
                return i;
            }
        }
        return -1;
    }
}