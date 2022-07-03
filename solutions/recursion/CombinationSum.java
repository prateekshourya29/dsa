package solutions.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/
public class CombinationSum {
  public static List<List<Integer>> combination(int[] candidates, ArrayList<Integer> list, int target, int i) {
    List<List<Integer>> ans = new ArrayList<>();
    if (target == 0) {
      ArrayList<Integer> l = new ArrayList<>(list);
      ans.add(l);
      return ans;
    }

    while (i < candidates.length ) {
      if (candidates[i] <= target) {
        list.add(candidates[i]);
        ans.addAll(combination(candidates, list, target - candidates[i], i));
        list.remove(list.size() - 1);
      }
      i++;
    }

    return ans;
  }


  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    return combination(candidates, new ArrayList<>(), target, 0);
  }

  public static void main(String[] args) {
    int[] candidates = {2, 3, 6, 7};
    int target = 7;
    System.out.println(combinationSum(candidates, target));
  }
}
