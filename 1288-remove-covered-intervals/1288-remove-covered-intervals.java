class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count =0;
        int max=-1;
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });

        for(int [] row:intervals){
            if(row[1]>max){
                count ++;
                max=row[1];
            }
        }
        return count;


        
    }
}