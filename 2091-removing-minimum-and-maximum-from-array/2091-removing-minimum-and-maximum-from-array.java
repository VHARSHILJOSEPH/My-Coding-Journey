class Solution {
    public int minimumDeletions(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;        
        int miindex=0;
        int maxindex=0;        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){ 
                max1=nums[i];               
                maxindex=i;
            }
            if(nums[i]<min1){  
                min1=nums[i];              
                miindex=i;
            }
        }
        int max=Math.max(miindex,maxindex);
        int min=Math.min(miindex,maxindex);
        int back1=max+1;
        int back2=nums.length-min;        
        int back3=(min+1)+(nums.length-max);
        return Math.min(back3,Math.min(back1,back2));
        
    }
}