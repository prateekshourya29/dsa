package solutions.arrays;

// https://leetcode.com/problems/min-max-game/
public class MinMax {
  public static int minMaxGame(int[] nums) {
    int n = nums.length;
    while (n != 1) {
      int[] new_nums = new int[n / 2];
      int j = 0;
      for (int i = 0; i < n; i += 2) {
        if (j % 2 == 0) {
          new_nums[j] = Math.min(nums[i], nums[i+1]);
        } else {
          new_nums[j] = Math.max(nums[i], nums[i+1]);
        }
        j++;
      }
      nums = new_nums;
      n = nums.length;
    }

    return nums[0];
  }

  public static void main(String[] args) {
    int[] nums = {1,3,5,2,4,8,2,2};
    System.out.println(minMaxGame(nums));
  }
}
