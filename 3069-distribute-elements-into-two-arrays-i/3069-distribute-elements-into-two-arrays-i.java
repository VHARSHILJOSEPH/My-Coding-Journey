class Solution {
    public int[] resultArray(int[] nums) {
        int k=-1;
        int k1=-1;
        int n = nums.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        arr1[++k] = nums[0];
        arr2[++k1] = nums[1];
        for (int i = 2; i < n; i++) {
            if (arr1[k] > arr2[k1]) {
                arr1[++k] = nums[i]; 
            } else {
                arr2[++k1] = nums[i]; 
            }
        }
        for(int i = 0; i <= k1; i++) {
            arr1[++k] = arr2[i];
        }

        return arr1;

    }
}