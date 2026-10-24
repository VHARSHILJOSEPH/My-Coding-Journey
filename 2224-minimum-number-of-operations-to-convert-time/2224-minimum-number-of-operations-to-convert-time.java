class Solution {
    public static int minutes(String time){
        int hours=Integer.parseInt(time.substring(0,2));
        int min=Integer.parseInt(time.substring(3,5));
        return hours*60+min;
    }
    public int convertTime(String current, String correct) {
        int cur=minutes(current);
        int cor=minutes(correct);
        int ans=0;
        if(cur>cor){
            int diff=cur-cor;
            while(diff>=60){
                diff-=60;
                ans++;
            }
            while(diff>=15){
                diff-=15;
                ans++;
            }
            while(diff>=5){
                diff-=5;
                ans++;
            }
            ans+=diff;
            return ans;
        }
        else{
            int diff=cor-cur;
            while(diff>=60){
                diff-=60;
                ans++;
            }
            while(diff>=15){
                diff-=15;
                ans++;
            }
            while(diff>=5){
                diff-=5;
                ans++;
            }
            ans+=diff;
            return ans;
        }
        
    }
}