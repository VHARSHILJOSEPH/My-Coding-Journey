class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max1 = weights[0];
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += weights[i];
            max1 = Math.max(weights[i], max1);
        }
        int low = max1;
        int high = totalSum;

        while(low<high){
            int mid = low + (high - low) / 2;
            int requiredDays = 1;
            int currentLoad = 0;
            for (int i = 0; i < n; i++) {
                if (currentLoad + weights[i] <= mid) {
                    currentLoad += weights[i];
                } else {
                    requiredDays++;
                    currentLoad = weights[i];
                }
            }
            if(requiredDays<=days){
                high=mid;
            }
            else{
                low=mid+1;
            }

        }
        return low;


        
    }
}