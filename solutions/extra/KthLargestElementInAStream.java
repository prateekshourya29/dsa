package solutions.extra;

import java.util.ArrayList;
import java.util.Collections;

// https://leetcode.com/problems/kth-largest-element-in-a-stream/
public class KthLargestElementInAStream {
  class KthLargest {
    ArrayList<Integer> nums;
    int k;
    
    public KthLargest(int k, int[] nums) {
      this.nums = new ArrayList<>();
      for (int i = 0; i < nums.length; i++) {
        this.nums.add(nums[i]);
      }
      this.k = k;
    }
    
    public int add(int val) {
      this.nums.add(val);
      Collections.sort(this.nums, Collections.reverseOrder());
      return this.nums.get(k - 1);
    }
  }
}
