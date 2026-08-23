class Solution {
    public boolean sumGame(String num) {    
        int n=num.length();
        int mid=n/2;
        int ls=0,rs=0;
        int l=0,r=mid;
        int leftq=0,rightq=0;;
        while(l<mid && r<n)
        {
            if(num.charAt(l)=='?'){
                leftq++;
            }
            if(num.charAt(r)=='?'){
                rightq++;
            }
            if(num.charAt(l)!='?'){
                ls += num.charAt(l) - '0';
            }
            if(num.charAt(r)!='?'){
                rs += num.charAt(r) - '0';
            }
            l++;
            r++;
        }
        int diff = ls - rs;
        int q = leftq - rightq;
        
        if (q % 2 != 0) {
            return true;
        }
        if(leftq+rightq==0 && ls!=rs){
            return true;
        }
        if(leftq+rightq == 0 && ls==rs){
            return false;
        }
        return diff != -(q / 2) * 9;
        


    }
}


