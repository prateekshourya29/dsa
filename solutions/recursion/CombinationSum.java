package solutions.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/
public class CombinationSum {
  public static List<List<Integer>> combination(int[] candidates, ArrayList<Integer> list, int target, int i) {
    List<List<Integer>> ans = new ArrayList<>();
    if (target == 0) {
      ans.add(list);
      return ans;
    }

    while (i < candidates.length ) {
      if (candidates[i] <= target) {
        ArrayList<Integer> l = new ArrayList<>();
        l.addAll(list);
        l.add(candidates[i]);
        ans.addAll(combination(candidates, l, target - candidates[i], i));
      }
      i++;
    }

    return ans;
  }


  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    ArrayList<Integer> list = new ArrayList<>();
    return combination(candidates, list, target, 0);
  }

  public static void main(String[] args) {
    int[] candidates = {};
    int target = 7;
    System.out.println(combinationSum(candidates, target));
  }
}
