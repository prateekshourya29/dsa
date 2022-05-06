package solutions.strings;

// https://leetcode.com/problems/longest-common-prefix/submissions/
public class LongestCommonPrefix {
  public static String commonPrefix(String s1, String s2) {
    int sl1 = s1.length();
    int sl2 = s2.length();

    StringBuilder str = new StringBuilder();
    int i = 0, j = 0;
    while (i < sl1 && j < sl2 && s1.charAt(i) == s2.charAt(j)) {
      str.append(s1.charAt(i));
      i++;
      j++;
    }

    return str.toString();
  }

  public static String longestCommonPrefix(String[] strs) {
    String ans = strs[0];

    for (int i = 1; i < strs.length; i++) {
      ans = commonPrefix(ans, strs[i]);
      if (ans.equals("")) break;
    }

    return ans;
  }

  public static void main(String[] args) {
    String[] strs = {"acc","aaa","aaba"};
    System.out.println(longestCommonPrefix(strs));
  }
}
