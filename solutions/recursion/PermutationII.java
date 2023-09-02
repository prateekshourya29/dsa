package solutions.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationII {
  public static List<List<Integer>> permutate(List<Integer> p, List<Integer> up) {
    List<List<Integer>> list = new ArrayList<>();
    if (up.isEmpty()) {
      list.add(p);
      return list;
    }

    int value = up.get(0);
    int len = p.size();
    for (int i = 0; i <= len; i++) {
      List<Integer> newP = new ArrayList<>();
      newP.addAll(p);
      newP.add(i, value);

      List<Integer> newUp = new ArrayList<>();
      newUp.addAll(up);
      newUp.remove(0); 

      list.addAll(permutate(newP, newUp));
    }

    return list;
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<Integer> up = new ArrayList<>();
    List<Integer> p = new ArrayList<>();
    for (int n : nums) {
      up.add(n);
    }

    return permutate(p, up);
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 2};
    System.out.println(permute(nums));
  }
}
