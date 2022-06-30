package solutions.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets/
public class SubsetArray {
  public static List<List<Integer>> subset(ArrayList<Integer> p, ArrayList<Integer> up) {
    List<List<Integer>> ans = new ArrayList<>();
    if (up.isEmpty()) {
      ans.add(p);
      return ans;
    }

    ArrayList<Integer> newUp = new ArrayList<>();
    newUp.addAll(up);
    newUp.remove(0);

    ArrayList<Integer> leftP = new ArrayList<>();
    leftP.addAll(p);
    ans.addAll(subset(leftP, newUp));

    ArrayList<Integer> rightP = new ArrayList<>();
    rightP.addAll(p);
    rightP.add(up.get(0));
    ans.addAll(subset(rightP, newUp));

    return ans;
  }

  public static List<List<Integer>> subsets(int[] nums) {
    ArrayList<Integer> up = new ArrayList<>();

    for (int n : nums) {
      up.add(n);
    }

    return subset(new ArrayList<>(), up);
  }

  public static void main(String[] args) {
    int[] nums = {0};
    System.out.println(subsets(nums));
  }
}
