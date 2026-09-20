class Solution {
    public int reverseDegree(String s) {
        int arr[]=new int[26];
        arr[0]=26;
        int ans=0;
        for(int i=1;i<26;i++){
            arr[i]=arr[i-1]-1;
        }
        for(int i=0;i<s.length();i++){
            ans+=(arr[s.charAt(i)-'a']*(i+1));
        }
        return ans;
        
    }
}