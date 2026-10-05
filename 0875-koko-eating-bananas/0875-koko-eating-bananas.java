class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed = 1;
        int maxspeed = 0;
        for (int n : piles) {
            maxspeed = Math.max(maxspeed, n);
        }
        int ans = maxspeed;

        while (minspeed <= maxspeed) {
            int mid = minspeed + (maxspeed - minspeed) / 2;

            if (canEat(piles, h, mid)) {
                ans = mid;
                maxspeed = mid - 1;
            } else {
                minspeed = mid + 1;
            }
        }
        return ans;
    }

    boolean canEat(int[] piles, int h, int k) {
        long hours = 0; 
        for (int p : piles) {
            hours += (p + k - 1) / k;
        }
        return hours <= h;
    }
}
