class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int n : nums) {
            max = Math.max(n, max);
            sum += n;
        }
        return nums.length * max - sum;
    }

}