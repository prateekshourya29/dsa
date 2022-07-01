package solutions.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/subsets-ii/
public class SubsetArrayII {
  public static List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> outer = new ArrayList<>();

    outer.add(new ArrayList<>());
    int start = 0, end = 0;

    for (int i = 0; i < nums.length; i++) {
      List<List<Integer>> inner = new ArrayList<>();
      if (i != 0 && nums[i] == nums[i - 1]) {
        start = end;
      } else {
        start = 0;
      }
      end = outer.size();

      for (int j = start; j < outer.size(); j++) {
        List<Integer> inn = new ArrayList<>(outer.get(j));
        inn.add(nums[i]);
        inner.add(inn);
      }

      for (List<Integer> inn : inner) {
        outer.add(inn);
      }
    }

    return outer;
  }

  public static void main(String[] args) {
    int[] nums = {5, 5, 5, 5, 5};
    System.out.println(subsetsWithDup(nums));
  }
}
