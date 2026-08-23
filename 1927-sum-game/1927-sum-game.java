class Solution {
    public boolean sumGame(String num) {

        int mid = num.length() / 2;

        int leftSum = 0, rightSum = 0;
        int leftQ = 0, rightQ = 0;

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

        // Greedy: unmatched '?' gives Alice the advantage
        if (q % 2 != 0)
            return true;

        // Greedy: maximum adjustment is 9 per effective move
        return diff != -(q / 2) * 9;
    }
}