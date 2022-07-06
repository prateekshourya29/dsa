package solutions.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum-iii/
public class CombinationSumIII {
  public static List<List<Integer>> backtrack(int n, int k, int start, List<Integer> list) {
    List<List<Integer>> ans = new ArrayList<>();
    if (k == 0) {
      if (n == 0) {
        List<Integer> l = new ArrayList<>(list);
        ans.add(l);
      }
      return ans;
    }

    for (int i = start; i <= 9; i++) {
      if (i <= n) {
        list.add(i);
        ans.addAll(backtrack(n - i, k - 1, i + 1, list));
        list.remove(list.size() - 1);
      }
    }

    return ans;
  }

  public static List<List<Integer>> combinationSum3(int k, int n) {
    return backtrack(n, k, 1, new ArrayList<>());
  } 
  public static void main(String[] args) {
    int k = 3, n = 1;
    System.out.println(combinationSum3(k, n));
  }
}
