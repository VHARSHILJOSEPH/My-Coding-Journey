class Solution {
    public boolean sumGame(String num) {

        int n = num.length();
        int mid = n / 2;

        int leftSum = 0;
        int rightSum = 0;
        int leftQ = 0;
        int rightQ = 0;

        for (int i = 0; i < mid; i++) {

            char l = num.charAt(i);
            char r = num.charAt(i + mid);

            if (l == '?')
                leftQ++;
            else
                leftSum += l - '0';

            if (r == '?')
                rightQ++;
            else
                rightSum += r - '0';
        }

        int diff = leftSum - rightSum;
        int q = leftQ - rightQ;

        // Odd number of unmatched '?'
        if (q % 2 != 0)
            return true;

        // Mathematical condition
        return diff != -(q / 2) * 9;
    }
}