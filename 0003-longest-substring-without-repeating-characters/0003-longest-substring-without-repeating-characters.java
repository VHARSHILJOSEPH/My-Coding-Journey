class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window=new HashSet<>();
        int max1=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            while (window.contains(s.charAt(r))){
                window.remove(s.charAt(l));
                l++;
            }
            window.add(s.charAt(r));
            max1=Math.max(max1,r+1-l);
        }
        return max1;
    }
}
    