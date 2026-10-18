
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

        while (low < high) {
            int mid = low + (high - low) / 2;
            int j = 0;
            int[] arr = new int[days];
            Arrays.fill(arr, 0);

            for (int i = 0; i < n; i++) {
                if (arr[j] + weights[i] <= mid) {
                    arr[j] += weights[i];
                } else {
                    j++;
                    if (j >= days) {
                        break;
                    }
                    arr[j] += weights[i];
                }
            }

            if (j < days && Arrays.stream(arr).sum() == totalSum) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
