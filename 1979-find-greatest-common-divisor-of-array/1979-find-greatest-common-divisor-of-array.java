class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length- 1];
        int re=Math.min(a,b);
        while(b>0){
            if(a%re==0 && b%re==0){
                return re;
            }
            re--;
        }
        return 1;
        
    }
}