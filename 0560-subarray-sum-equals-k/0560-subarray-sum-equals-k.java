class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int sum = 0;
        for (int n : nums) {
            sum += n;
            int dif = sum - k;
            if (mp.containsKey(dif)) {
                ans += mp.getOrDefault(dif, 1);
            }

            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return ans;

    }
}