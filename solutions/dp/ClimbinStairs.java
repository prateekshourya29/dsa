package solutions.dp;

import java.util.Arrays;

// https://leetcode.com/problems/climbing-stairs/
public class ClimbinStairs {
  public static int rec(int n, int[] dp) {
    if (n == 0 || n == 1) {
      return 1;
    }
    if (dp[n] != -1)
      return dp[n];

    return dp[n] = rec(n - 1, dp) + rec(n - 2, dp);
  }

  public static int climbStairs(int n) {
    int[] dp = new int[n + 1];
    Arrays.fill(dp, -1);
    return rec(n, dp);
  }

  public static void main(String[] args) {
    System.out.println(climbStairs(44));
  }
}
