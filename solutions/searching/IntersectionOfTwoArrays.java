package solutions.searching;

import java.util.ArrayList;
import java.util.HashSet;

// [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)
public class IntersectionOfTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<Integer>();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    for (int i = 0; i < nums1.length; i++) {
      set.add(nums1[i]);
    }
    
    for (int i = 0; i < nums2.length; i++) {
      if (set.contains(nums2[i])) {
        arr.add(nums2[i]);
        set.remove(nums2[i]);
      }
    }
    
    int[] ans = new int[arr.size()];
    for (int i = 0; i < arr.size(); i++) {
      ans[i] = arr.get(i);
    }
    
    return ans;
  }
}
