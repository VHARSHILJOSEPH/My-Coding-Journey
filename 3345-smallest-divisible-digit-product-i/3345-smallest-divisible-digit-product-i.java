class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int a = 1;
            int te = n;
            while (te > 0) {
                a *= te % 10; 
                te /= 10; 
            }
            if (a % t == 0)
                return n;
            n++;
        }
        

    }
}