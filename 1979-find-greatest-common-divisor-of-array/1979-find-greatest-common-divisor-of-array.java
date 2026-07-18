class Solution {
    public int findGCD(int[] nums) {
        int a=nums[0];int b=nums[0];
        for(int i:nums){
            if(i>a){
                a=i;
            }
            if(i<b){
                b=i;
            }

        }
        return gcd(b,a);
        
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}