class Solution {
    public int missingInteger(int[] nums) {
        int sqmax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sqmax += nums[i];
            } else {
                break;
            }
        }

        Arrays.sort(nums);

        for (int x : nums) {
            if (x == sqmax) {
                sqmax++;
            } else if (x > sqmax) {
                break;
            }
        }

        return sqmax;
    }
}