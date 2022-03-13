package solutions.arrays;

// [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
public class NumberOfGoodPairs {
  public int numIdenticalPairs(int[] nums) {
    int good_pair = 0;
    for (int i=0; i < nums.length; i++) {
      for (int j=i+1; j < nums.length; j++) {
          if (nums[i] == nums[j]) good_pair++;
      }
    }
    return good_pair;
  }
}
