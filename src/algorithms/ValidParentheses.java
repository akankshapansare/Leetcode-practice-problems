package algorithms;

import java.util.Stack;

/**
 * Created by akanksha on 1/31/2018.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                char temp = stack.pop();
                if(temp == '(' && s.charAt(i) == ')' || temp == '[' && s.charAt(i) == ']' || temp == '{' && s.charAt(i) == '}') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
