package solutions.stack_queue;

import java.util.Stack;

// https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class EvaluateReversePolishNotation {
  public static int evalRPN(String[] tokens) {
    Stack<Integer> st = new Stack<>();
    
    for (String t : tokens) {
      if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
        int b = st.pop();
        int a = st.pop();
        int result = 0;
        switch (t) {
          case "+": result = a + b; break;
          case "-": result = a - b; break;
          case "*": result = a * b; break;
          case "/": result = a / b; break;
        }
        st.push(result);
      } else {
        st.push(Integer.parseInt(t));
      }
    }

    return st.peek();
  }

  public static void main(String[] args) {
    String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
    System.out.println(evalRPN(tokens));
  }
}
