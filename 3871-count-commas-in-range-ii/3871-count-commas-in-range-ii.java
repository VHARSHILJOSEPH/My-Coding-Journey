class Solution {
    public long countCommas(long n) {
        long ans = 0;
        int n1 = 0;

        long temp = n;

        while (temp > 0) {
            n1++;
            temp /= 10;
        }

        long power = 1000;

        while (n1 > 3) {
            ans += n - power + 1;

            power *= 1000;
            n1 -= 3;
        }

        return ans;
    }
}