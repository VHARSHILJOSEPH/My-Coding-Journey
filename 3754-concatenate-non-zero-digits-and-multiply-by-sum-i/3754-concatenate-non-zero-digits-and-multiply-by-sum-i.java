class Solution {
    public long sumAndMultiply(int n) {
        int ans=0;
        int re=0;
        int reversed=0;
        while(n>0){
            int a=n%10;
            if(a!=0){
                ans=ans*10+a;
                re+=a;
            }
            n/=10;
        }
        while(ans!=0){
            int a=ans%10;
            reversed = reversed * 10 + a;
            ans/=10;
        }
        
        return (long)reversed*re;        
        
    }
}