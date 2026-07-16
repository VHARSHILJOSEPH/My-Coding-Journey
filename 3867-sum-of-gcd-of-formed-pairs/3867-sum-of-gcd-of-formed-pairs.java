class Solution {
    public long gcdSum(int[] nums) {
        int max=-1;
        int temp[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            temp[i]=gcd(max,nums[i]);
        }
        Arrays.sort(temp);
        long sum=0;
        int i=0,j=nums.length-1;
        while(i<j){
            sum+=gcd(temp[i],temp[j]);
            i++;
            j--;
        }
        return sum;        
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}