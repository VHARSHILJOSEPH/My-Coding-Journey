class Solution {
    public int totalNumbers(int[] digits) {
        int f[]=new int [10];
        int ans=0;
        for(int n:digits){
            f[n]++;
        }
        for(int i=1;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<9;k+=2){
                    f[i]--;f[j]--;f[k]--;
                    if(f[i]>=0 && f[j]>=0 && f[k]>=0)  {
                        ans++;
                    }
                    f[i]++;f[j]++;f[k]++;

                }
            }
        }
        return ans;
        
    }
}