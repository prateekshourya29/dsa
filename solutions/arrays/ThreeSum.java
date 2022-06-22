package solutions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/
public class ThreeSum {
  public static List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> list = new ArrayList<>();
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      if (i != 0 && nums[i] == nums[i -1]) continue;

      int target = nums[i] * -1;
      int j = i + 1;
      int k = n - 1;
      while (j < k) {
        int value = nums[j] + nums[k];
        if (value == target) {
          List<Integer> l = new ArrayList<>();
          l.add(nums[i]);
          l.add(nums[j]);
          l.add(nums[k]);
          list.add(l);
          j++;
          while (nums[j] == nums[j - 1] && j < k) {
            j++;
          }
        } else if (value < target) {
          j++;
        } else {
          k--;
        }
      }
    }

    return list;
  }

  public static void main(String[] args) {
    int[] nums = {-2,0,0,2,2};
    System.out.println(threeSum(nums));
  }
}
