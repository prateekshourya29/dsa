package solutions.strings;

import java.util.Arrays;

// https://leetcode.com/problems/sorting-the-sentence/
public class SortingSentence {
  public static String sortSentence(String s) {
    String[] arr = s.split(" ");
    Arrays.sort(arr, (a, b) -> {
      if (a.charAt(a.length() - 1) < b.charAt(b.length() - 1)) {
        return -1;
      } else return 1;
    });

    StringBuilder ans = new StringBuilder();
    for (String str: arr) {
      ans.append(str.substring(0, str.length() - 1) + " ");
    }

    return ans.toString().strip();
  }

  public static void main(String[] args) {
    String s = "is2 sentence4 This1 a3";
    System.out.println(sortSentence(s));
  }
}
