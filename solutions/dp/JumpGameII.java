package solutions.dp;

import java.util.Arrays;

// https://leetcode.com/problems/jump-game-ii/
public class JumpGameII {
  public static int rec(int i, int[] nums, int n, int[] map) {
    if (i == n)
      return 0;

    if (map[i] != 10001) {
      return map[i];
    }

    for (int j = 1; j <= nums[i] && i + j <= n; j++) {
      map[i] = Math.min(map[i], 1 + rec(i + j, nums, n, map));
    }

    return map[i];
  }

  public static int jump(int[] nums) {
    int[] map = new int[nums.length];
    Arrays.fill(map, 10001);
    return rec(0, nums, nums.length - 1, map);
  }

  public static void main(String[] args) {
    int[] nums = { 2, 3, 1, 1, 4 };
    System.out.println(jump(nums));
  }
}
