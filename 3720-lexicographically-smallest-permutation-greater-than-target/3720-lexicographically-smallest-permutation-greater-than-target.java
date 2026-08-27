class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int n = s.length();

        
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        char[] ans = new char[n];

        
        for (int i = 0; i < n; i++) {

            int t = target.charAt(i) - 'a';

            
            if (freq[t] > 0) {
                ans[i] = target.charAt(i);
                freq[t]--;
            } 
            else {

                
                int bigger = findBigger(freq, t);

                if (bigger != -1) {
                    ans[i] = (char) ('a' + bigger);
                    freq[bigger]--;

                    fillRemaining(ans, i + 1, freq);

                    return new String(ans);
                }

               
                for (int j = i - 1; j >= 0; j--) {

                    
                    int old = ans[j] - 'a';
                    freq[old]++;

                    int targetChar = target.charAt(j) - 'a';

                    
                    int biggerAtJ = findBigger(freq, targetChar);

                    if (biggerAtJ != -1) {

                        ans[j] = (char) ('a' + biggerAtJ);
                        freq[biggerAtJ]--;

                        fillRemaining(ans, j + 1, freq);

                        return new String(ans);
                    }
                }

                return "";
            }
        }

        
        for (int i = n - 1; i >= 0; i--) {

            
            int old = ans[i] - 'a';
            freq[old]++;

            int targetChar = target.charAt(i) - 'a';

            
            int bigger = findBigger(freq, targetChar);

            if (bigger != -1) {

                ans[i] = (char) ('a' + bigger);
                freq[bigger]--;

                fillRemaining(ans, i + 1, freq);

                return new String(ans);
            }
        }

        return "";
    }

    
    private int findBigger(int[] freq, int targetChar) {

        for (int c = targetChar + 1; c < 26; c++) {
            if (freq[c] > 0) {
                return c;
            }
        }

        return -1;
    }

    
    private void fillRemaining(char[] ans, int pos, int[] freq) {

        for (int c = 0; c < 26; c++) {

            while (freq[c] > 0) {
                ans[pos++] = (char) ('a' + c);
                freq[c]--;
            }
        }
    }
}