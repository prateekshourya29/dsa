package solutions.arrays;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        char last = ' ';
        if (!stack.empty()) last = stack.peek();
        if ((last == '(' && c == ')') || (last == '{' && c == '}') || (last == '[' && c == ']')) {
          stack.pop();
        } else {
          stack.push(c);
        }
      }
    }
    
    return stack.empty();
  }
}
