class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int n1=n;
        while(n!=0){
            int temp=n%10;
            sum+=temp;
            mul*=temp;
            n/=10;
        }
        if(n1%(sum+mul)==0) return true;
        return  false;
        
    }
}