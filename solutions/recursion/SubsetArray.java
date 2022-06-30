package solutions.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets/
public class SubsetArray {
  public static List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> outer = new ArrayList<>();

    outer.add(new ArrayList<>());

    for (int n : nums) {
      List<List<Integer>> inner = new ArrayList<>();

      for (List<Integer> out : outer) {
        List<Integer> inn = new ArrayList<>(out);
        inn.add(n);
        inner.add(inn);
      }

      for (List<Integer> inn : inner) {
        outer.add(inn);
      }
    }

    return outer;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    System.out.println(subsets(nums));
  }
}
