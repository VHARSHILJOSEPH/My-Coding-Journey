import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int longestValidParentheses(String s) {
        int ans = 0;
       
        Deque<Integer> stack = new ArrayDeque<>();
        
        
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(i);
            } 
            
            else {
                
                stack.pop();

                if (stack.isEmpty()) {
                    
                    stack.push(i);
                } else {
                    
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }
        return ans;
    }
}
