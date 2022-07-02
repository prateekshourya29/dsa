package solutions.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/combination-sum-ii/
public class CombinationSumII {
  public static List<List<Integer>> combination2(int[] candidates, ArrayList<Integer> list, int target, int i) {
    List<List<Integer>> ans = new ArrayList<>();
    if (target == 0) {
      ans.add(list);
      return ans;
    }

    while (i < candidates.length) {
      if (candidates[i] <= target) {
        ArrayList<Integer> l = new ArrayList<>();
        l.addAll(list);
        l.add(candidates[i]);
        ans.addAll(combination2(candidates, l, target - candidates[i], i + 1));
      }
      i++;
      while (i > 0 && i < candidates.length && candidates[i] == candidates[i - 1]) {
        i++;
      }
    }

    return ans;
  }


  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    ArrayList<Integer> list = new ArrayList<>();
    return combination2(candidates, list, target, 0);
  }

  public static void main(String[] args) {
    int[] candidates = {10,1,2,7,6,1,5};
    int target = 8;
    Arrays.sort(candidates);
    System.out.println(combinationSum(candidates, target));
  }
}
