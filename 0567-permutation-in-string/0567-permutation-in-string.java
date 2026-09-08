class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int l = 0;

        for (int r = 0; r < s2.length(); r++) {
            char c = s2.charAt(r);
            map2.put(c, map2.getOrDefault(c, 0) + 1);

            if (r - l + 1 > s1.length()) {
                char left = s2.charAt(l);
                map2.put(left, map2.get(left) - 1);

                if (map2.get(left) == 0) {
                    map2.remove(left);
                }

                l++;
            }

            if (map1.equals(map2)) {
                return true;
            }
        }

        return false;
    }
}