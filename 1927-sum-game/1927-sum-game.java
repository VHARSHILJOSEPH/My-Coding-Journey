class Solution {
    public boolean sumGame(String num) {
        int half = num.length() >> 1;
        int diff = 0;
        int q = 0;

        for (int i = 0, j = half; i < half; i++, j++) {
            char l = num.charAt(i);
            char r = num.charAt(j);

            if (l == '?')
                q++;
            else
                diff += l - '0';

            if (r == '?')
                q--;
            else
                diff -= r - '0';
        }

        if ((q & 1) != 0)
            return true;

        return diff + 9 * (q >> 1) != 0;
    }
}class Solution {
    public boolean sumGame(String num) {
        int half = num.length() >> 1;
        int diff = 0;
        int q = 0;

        for (int i = 0, j = half; i < half; i++, j++) {
            char l = num.charAt(i);
            char r = num.charAt(j);

            if (l == '?')
                q++;
            else
                diff += l - '0';

            if (r == '?')
                q--;
            else
                diff -= r - '0';
        }

        if ((q & 1) != 0)
            return true;

        return diff + 9 * (q >> 1) != 0;
    }
}