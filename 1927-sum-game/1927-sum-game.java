class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int mid = n / 2;

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

        int q = leftQ - rightQ;

        if ((q & 1) != 0)
            return true;

        return leftSum - rightSum != -(q / 2) * 9;
    }
}