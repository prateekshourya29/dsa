package solutions.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/palindrome-partitioning/
public class PalindromePartition {
  public static boolean isPalindrome(String s) {
    int i = 0;
    int j = s.length() - 1;

    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }

    return true;
  }

  public static List<List<String>> backtrack(List<String> list, String s, int k) {
    List<List<String>> ans = new ArrayList<>();
    if (s.isEmpty()) {
      List<String> l = new ArrayList<>(list);
      ans.add(l);
      return ans;
    }

    if (k > s.length()) {
      return ans;
    }

    String value = s.substring(0, k);
    s = s.substring(k);
    
    if (isPalindrome(value)) {
      list.add(value);
      ans.addAll(backtrack(list, s, 1));
      list.remove(list.size() - 1);
    }

    s = value + s;
    ans.addAll(backtrack(list, s, k + 1));
    return ans;
  }

  public static List<List<String>> partition(String s) {
    return backtrack(new ArrayList<>(), s, 1);
  }

  public static void main(String[] args) {
    String s = "baa";
    System.out.println(partition(s));
  }
}
