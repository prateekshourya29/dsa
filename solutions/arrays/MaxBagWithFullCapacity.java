package solutions.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/
public class MaxBagWithFullCapacity {
  public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
    int n = capacity.length;
    int[] capacityLeft = new int[n];

    for (int i = 0; i < n; i++) {
      capacityLeft[i] = capacity[i] - rocks[i];
    }

    Arrays.sort(capacityLeft);

    int i = 0;
    while (i < capacityLeft.length && additionalRocks > 0) {
      if (capacityLeft[i] == 0) {
        i++;
      } else {
        if (capacityLeft[i] > additionalRocks) {
          capacityLeft[i] -= additionalRocks;
          additionalRocks = 0;
        } else {
          additionalRocks -= capacityLeft[i];
          capacityLeft[i] = 0; 
        }
      }
    }

    int ans = 0;
    i = 0;
    while (i < capacityLeft.length && capacityLeft[i++] == 0) ans++;

    return ans;
  }

  public static void main(String[] args) {
    int[] capacity = {2,3,4,5}, rocks = {1,2,4,4};
    int additionalRocks = 1;

    System.out.println(maximumBags(capacity, rocks, additionalRocks));
  }
}
