class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ans=0;
        while(l<r){
            int h=height[l]>height[r]?height[r]:height[l];
            int area=h*(r-l);
            ans=ans>area?ans:area;
            if(height[l]<height[r]) l++;
            else    r--;
        }
        return ans;
    }
}