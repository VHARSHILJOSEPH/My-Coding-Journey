class Solution {
    public int longestValidParentheses(String s) {
        int ans = 0;
        
        Deque<Integer> st = new ArrayDeque<>();
        
        int left = 0; 
        
        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            
            if (ch == '[' || ch == '(' || ch == '{') {
               st.push(r); 
            }
            
            else if (!st.isEmpty() && (
                (ch == ']' && s.charAt(st.peek()) == '[') || 
                (ch == '}' && s.charAt(st.peek()) == '{') || 
                (ch == ')' && s.charAt(st.peek()) == '('))) {
                
                st.pop(); 
                
                if (st.isEmpty()) {
                    ans = Math.max(ans, r - left + 1);
                } else {
                    ans = Math.max(ans, r - st.peek());
                }
            }

            else {
               st.clear();   
               left = r + 1; 
            }
        }
        return ans;
    }
}
