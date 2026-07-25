class Solution {
    public int maxProduct(int n) {
        int max1=-1;
        int max2=-1;
        while(n!=0){
            int a=n%10;
            n/=10;
            if(a>=max1){
                max2=max1;
                max1=a;
                continue;
            }
            else if(a>=max2 && a<=max1){
                max2=a;
            }                      
        }
        return max1*max2;
        
    }
}