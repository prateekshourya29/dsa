package solutions.dp;

import java.util.Arrays;

// https://www.codingninjas.com/codestudio/problems/frog-jump_3621012
public class FrogJump {
  public static int rec(int i, int heights[], int n, int curr_cost, int[] cost) {
    if (i == n)
      return curr_cost;
    if (cost[i] != -1)
      return cost[i] + curr_cost;

    int total_cost = rec(i + 1, heights, n, curr_cost + Math.abs(heights[i] - heights[i + 1]), cost);
    if (i + 2 <= n)
      total_cost = Math.min(total_cost,
          rec(i + 2, heights, n, curr_cost + Math.abs(heights[i] - heights[i + 2]), cost));
    cost[i] = total_cost - curr_cost;

    return total_cost;
  }

  public static int frogJump(int n, int heights[]) {
    // Write your code here..
    int[] cost = new int[heights.length];
    Arrays.fill(cost, -1);
    return rec(0, heights, heights.length - 1, 0, cost);
  }

  public static void main(String[] args) {
    int[] heights = { 4, 8, 3, 10, 4, 4 };
    System.out.println(frogJump(heights.length, heights));
  }
}
