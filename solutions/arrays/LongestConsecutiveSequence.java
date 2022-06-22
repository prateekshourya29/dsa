package solutions.arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {
  public static int longestConsecutive(int[] nums) {
    HashSet<Integer> set = new HashSet<>();

    for (int num: nums) {
      set.add(num);
    }

    int max = 0;
    for (int n: set) {
      if (!set.contains(n - 1)) {
        int currNum = n;
        int curr = 1;

        while (set.contains(currNum + 1)) {
          currNum += 1;
          curr += 1;
        }

        max = Math.max(curr, max);
      }
    }

    return max;
  }

  public static void main(String[] args) {
    int[] nums = {0,3,7,2,5,8,4,6,0,1};
    System.out.println(longestConsecutive(nums));
  }
}
