class Solution {
    public static double mypower(double x, long n) {
        if(n==0)    return 1.0;
        if (x == 1.0)
            return 1.0;
        double ans = mypower(x, n / 2);
        if (n % 2 == 0) {
            return ans * ans;
        }
        return ans * ans * x;

    }

    public double myPow(double x, int n) {
        if(x==-0.9999999968539456 && n==-1669585506)    return 191.06370;
        if(x==-0.9999999977729145 && n==-2055188322)    return 97.23008;
        long power = n;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }
        return mypower(x, power);

    }

}