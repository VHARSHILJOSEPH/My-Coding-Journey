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

        for (int i = 0; i < nums.length - 1; i++) {
    for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}

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