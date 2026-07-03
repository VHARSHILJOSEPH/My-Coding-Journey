class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=0;
        int right=0;
        while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                left++;
            }
            else{
                int temp=nums1[left];
                nums1[left]=nums2[right];
                nums2[right]=temp; 
                Arrays.sort(nums2);
                left++;          
            }
        }
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }

    }
}