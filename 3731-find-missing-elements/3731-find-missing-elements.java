class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int i=min;i<max;i++){
            if(Arrays.binarySearch(nums, i) < 0){
                ans.add(i);
            }
        }
        return ans;
        
    }
}