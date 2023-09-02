package solutions.extra;

import java.util.Arrays;
import java.util.HashSet;

public class NumberOfDistinctAverage {
  public static int distinctAverages(int[] nums) {
    HashSet<Double> set = new HashSet<>();

    Arrays.sort(nums);

    int i = 0;
    int j = nums.length - 1;

    while (i < j) {
      double avg = (nums[i] + nums[j]) / (double) 2;
      set.add(avg);
      i++;
      j--;
    }

    return set.size();
  }

  public static void main(String[] args) {
    int[] nums = { 9, 5, 7, 8, 7, 9, 8, 2, 0, 7 };
    System.out.println(distinctAverages(nums));
  }
}
