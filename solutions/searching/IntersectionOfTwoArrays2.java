package solutions.searching;

import java.util.ArrayList;
import java.util.HashMap;

// [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)
public class IntersectionOfTwoArrays2 {
  public int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> arr = new ArrayList<>();

    for (int i = 0; i < nums1.length; i++) {
      if (map.containsKey(nums1[i])) {
        int value = map.get(nums1[i]);
        map.replace(nums1[i], value + 1);
      } else {
        map.put(nums1[i], 1);
      }
    }

    for (int i = 0; i < nums2.length; i++) {
      if (map.containsKey(nums2[i])) {
        int value = map.get(nums2[i]);
        if (value > 0) {
          arr.add(nums2[i]);
          map.replace(nums2[i], value - 1);
        }
      }
    }

    int[] ans = new int[arr.size()];
    for (int i = 0; i < arr.size(); i++) {
      ans[i] = arr.get(i);
    }

    return ans;
  }
}
