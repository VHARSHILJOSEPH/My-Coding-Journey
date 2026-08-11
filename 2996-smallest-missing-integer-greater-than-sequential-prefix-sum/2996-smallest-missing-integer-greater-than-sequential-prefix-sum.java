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

        int x = sqmax;

        while (true) {
            boolean found = false;

            for (int num : nums) {
                if (num == x) {
                    found = true;
                    break;
                }
            }

            if (!found)
                return x;

            x++;
        }
    }
}