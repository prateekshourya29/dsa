package solutions.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutations/
public class PermutationArray {
  public static List<List<Integer>> permutate(List<Integer> p, List<Integer> up) {
    List<List<Integer>> list = new ArrayList<>();
    if (up.isEmpty()) {
      List<Integer> l = new ArrayList<>(p);
      list.add(l);
      return list;
    }

    int value = up.get(0);
    int len = p.size();
    for (int i = 0; i <= len; i++) {
      p.add(i, value);
      up.remove(0); 
      list.addAll(permutate(p, up));
      p.remove(i);
      up.add(0, value);
    }

    return list;
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<Integer> up = new ArrayList<>();
    for (int n : nums) {
      up.add(n);
    }

    return permutate(new ArrayList<>(), up);
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    System.out.println(permute(nums));
  }
}
