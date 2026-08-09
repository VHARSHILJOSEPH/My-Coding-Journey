class Solution {
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        int[] suffixSum = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }

        int dp[][]=new int[n+1][n+1];
        for (int i = n - 1; i >= 0; i--) {
            for (int M = 1; M <= n; M++) {
                if(i+2*M>=n){
                    dp[i][M]=suffixSum[i];
                    continue;
                }
                for (int X = 1; X <= 2 * M; X++) {
                    int nextM = Math.max(M, X);
                    int currentTake = suffixSum[i] - dp[i + X][nextM];
                    dp[i][M] = Math.max(dp[i][M], currentTake);
                }        
        
            }
            
        }
        
        return dp[0][1];
        
    }
}