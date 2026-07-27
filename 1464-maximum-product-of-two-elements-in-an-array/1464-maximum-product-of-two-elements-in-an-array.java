class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int a : nums) {
            if (a >= max1) {
                max2 = max1;
                max1 = a;
            } 
            else if (a >= max2) {
                max2 = a;
            }
            if (a < min1) {
                min2 = min1;
                min1 = a;
            } else if (a < min2) {
                min2 = a;
            }
        }

        int p1 = (max1 - 1) * (max2 - 1);
        int p2 = (min1 - 1) * (min2 - 1);

        return Math.max(p1, p2);

    
    }
}