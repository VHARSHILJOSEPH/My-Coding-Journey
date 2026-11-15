class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;

        for (int k = l; k <= r; k++) {
            int sum = 0;
            int i = 0;

            for (int j = 0; j < nums.size(); j++) {
                sum += nums.get(j);

                if (j - i + 1 > k) {
                    sum -= nums.get(i);
                    i++;
                }

                if (j - i + 1 == k && sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}