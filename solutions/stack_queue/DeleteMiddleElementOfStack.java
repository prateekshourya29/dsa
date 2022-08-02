package solutions.stack_queue;

import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1
public class DeleteMiddleElementOfStack {
  public static void deleteMid(Stack<Integer> s, int sizeOfStack) {
    // code here
    Stack<Integer> temp = new Stack<>();
    int mid = sizeOfStack / 2;
    while (mid > 0) {
      temp.push(s.pop());
      mid--;
    }
    s.pop();
    while (!temp.empty()) {
      s.push(temp.pop());
    }
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    for (int i = 1; i <= 5; i++)
      st.push(i);
    System.out.println(st);
    deleteMid(st, st.size());
    System.out.println(st);
  }
}
