class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] count = new int[26];
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int required = p.length();

        while (right < s.length()) {

            
            char c = s.charAt(right);

            if (count[c - 'a'] > 0) {
                required--;
            }

            count[c - 'a']--;
            right++;

            if (right - left > p.length()) {

                char removed = s.charAt(left);

                count[removed - 'a']++;

                if (count[removed - 'a'] > 0) {
                    required++;
                }

                left++;
            }

            
            if (required == 0 && right - left == p.length()) {
                ans.add(left);
            }
        }

        return ans;
    }
}