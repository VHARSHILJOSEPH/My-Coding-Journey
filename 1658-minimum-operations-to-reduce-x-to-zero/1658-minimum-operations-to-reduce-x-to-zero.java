class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int target = total - x;
        if (target < 0) {
            return -1;
        }
        if (target == 0) {
            return nums.length;
        }
        int l = 0;
        int sum = 0;
        int maxLen = -1;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum > target && l <= r) {
                sum -= nums[l];
                l++;
            }

            if (sum == target) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }

        return maxLen == -1 ? -1 : nums.length - maxLen;
    }
}