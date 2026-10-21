class Solution {
    public static int fibs(int n){
        if(n==0)    return 0;
        if(n==1)    return 1;
        return fibs(n-1)+fibs(n-2);

    }
    public int fib(int n) {
        return fibs(n);
    }
}