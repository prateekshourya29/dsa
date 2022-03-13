package solutions.arrays;

// [Jump Game](https://leetcode.com/problems/jump-game/)
public class JumpGame {
  public boolean canJump(int[] nums) {
    int sumSteps = 0;
    if (nums.length == 1){
      return true;
    }
    for (int i = 0; i < nums.length - 1; i++) {
      sumSteps = sumSteps < nums[i] ? nums[i] : sumSteps;
      if (sumSteps == 0) {
        return false;
      }
      sumSteps--;
    }
    return true;
  }
}
