package solutions.stack_queue;

import java.util.Stack;

/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// https://leetcode.com/problems/implement-queue-using-stacks/
// @lc code=start
class MyQueue {
  Stack<Integer> st;
  Stack<Integer> temp;

  public MyQueue() {
    st = new Stack<>();
    temp = new Stack<>();
  }

  public void push(int x) {
    st.push(x);
  }

  public int pop() {
    while (!st.empty()) {
      int val = st.pop();
      temp.push(val);
    }

    int removed_value = temp.pop();

    while (!temp.empty()) {
      int val = temp.pop();
      st.push(val);
    }

    return removed_value;
  }

  public int peek() {
    while (!st.empty()) {
      int val = st.pop();
      temp.push(val);
    }

    int peek = temp.peek();

    while (!temp.empty()) {
      int val = temp.pop();
      st.push(val);
    }

    return peek;
  }

  public boolean empty() {
    return st.empty();
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
