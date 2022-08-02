package solutions.stack_queue;

import java.util.Stack;

/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// https://leetcode.com/problems/daily-temperatures/
// @lc code=start
class Solution {
	public int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int[] ans = new int[n];

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < n; i++) {
			while (!st.empty() && temperatures[i] > temperatures[st.peek()]) {
				int prev = st.pop();
				ans[prev] = i - prev;
			}
			st.push(i);
		}

		return ans;
	}
}
// @lc code=end
