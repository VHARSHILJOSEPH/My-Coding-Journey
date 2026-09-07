class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;        
        for (int i = low; i <= high; i++) {           
            String str = String.valueOf(i);
            int len = str.length();
            if (len % 2 != 0) {
                continue;
            }            
            int mid = len / 2;
            int lsum = 0;
            int rsum = 0;
            for (int j = 0; j < mid; j++) {
                lsum += str.charAt(j) - '0';       
                rsum += str.charAt(mid + j) - '0'; 
            }            
            if (lsum == rsum) {
                ans++;
            }
        }
        
        return ans;
    }
}
