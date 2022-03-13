package solutions.arrays;

// [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
public class ShuffleArray {
  public int[] shuffle(int[] nums, int n) {
    int[] new_nums = new int[nums.length];
    int index = 0;
    for (int i = 0; i < n; i += 1) {
        new_nums[index] = nums[i];
        new_nums[index+1] = nums[n+i];
        index += 2;
    }
    return new_nums;
  }
}
