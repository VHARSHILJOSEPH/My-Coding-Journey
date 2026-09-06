class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ans=0;
        while(l<r){
            int h=height[l]>height[r]?height[r]:height[l];
            ans=ans>h*(r-l)?ans:h*(r-l);
            if(height[l]<=height[r]){
                int curh=height[l];
                while(l<r && curh>=height[l])    l++;
            } 
            else{
                int curh=height[r];
                while(l<r && curh>=height[r])    r--;

            }   
        }
        return ans;
    }
}