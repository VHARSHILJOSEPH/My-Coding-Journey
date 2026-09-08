class Solution {
    public int characterReplacement(String s, int k) {

        int ans = -1;

        HashMap<Character, List<Integer>> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!mp.containsKey(c)) {
                mp.put(c, new ArrayList<>());
            }

            mp.get(c).add(i);
        }

        for (char c : mp.keySet()) {

            List<Integer> temp = mp.get(c);

            int l = 0;
            int r = 0;

            while (r < temp.size()) {

                int length = temp.get(r) - temp.get(l) + 1;

                int required = length - (r - l + 1);

                if (required <= k) {

                    int possible = length + (k - required);

                    ans = Math.max(
                        ans,
                        Math.min(s.length(), possible)
                    );

                    r++;

                } else {
                    l++;
                }
            }
        }

        return ans;
    }
}