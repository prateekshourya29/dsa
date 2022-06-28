package solutions.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combinations/
public class Combinations {
  public static List<List<Integer>> combination(List<Integer> list, int i, int n, int k) {
    List<List<Integer>> ans = new ArrayList<>();
    if (list.size() == k) {
      ans.add(list);
      return ans;
    }

    for (int j = i; j <= n; j++) {
      List<Integer> l = new ArrayList<>();
      l.addAll(list);
      l.add(j);
      ans.addAll(combination(l, j + 1, n, k));
    }

    return ans;
  } 

  public static List<List<Integer>> combine(int n, int k) {
    List<Integer> list = new ArrayList<>();
    return combination(list, 1, n, k);
  }

  public static void main(String[] args) {
    int n = 4, k = 2;
    combine(n, k);
  }
}
