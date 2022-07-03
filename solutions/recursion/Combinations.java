package solutions.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combinations/
public class Combinations {
  public static List<List<Integer>> combination(List<Integer> list, int i, int n, int k) {
    List<List<Integer>> ans = new ArrayList<>();
    if (list.size() == k) {
      List<Integer> l = new ArrayList<>(list);
      ans.add(l);
      return ans;
    }

    for (int j = i; j <= n; j++) {
      list.add(j);
      ans.addAll(combination(list, j + 1, n, k));
      list.remove(list.size() - 1);
    }

    return ans;
  } 

  public static List<List<Integer>> combine(int n, int k) {    
    return combination(new ArrayList<>(), 1, n, k);
  }

  public static void main(String[] args) {
    int n = 4, k = 2;
    System.out.println(combine(n, k));
  }
}
