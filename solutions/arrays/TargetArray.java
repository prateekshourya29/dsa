package solutions.arrays;
import java.util.Arrays;

// [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
public class TargetArray {
  public int[] createTargetArray(int[] nums, int[] index) {
      int[] target = new int[nums.length];
      Arrays.fill(target, -1); // Set each element to -1. Since 0 <= nums[i] <= 100
      for (int i = 0; i < nums.length; i++) {
          if (target[index[i]] != -1) {
              // If the index is already occupied find the first empty index shift all the values one right and then fill that index.
              int j = index[i];
              while (target[j] != -1) {
                  j++;
              }
              for (; j > index[i]; j--) {
                  target[j] = target[j-1];
              }
          }
          target[index[i]] = nums[i];
      }
      return target;
  }
}
