package solutions.extra;

import java.util.Arrays;

// https://leetcode.com/problems/odd-string-difference/
public class OddStringDifference {
  public static int[] getDifference(String word) {
    char[] w = word.toCharArray();
    int[] diff = new int[word.length() - 1];

    for (int i = 1; i < w.length; i++) {
      diff[i - 1] = (w[i] - 97) - (w[i - 1] - 97);
    }

    return diff;
  }

  public static String oddString(String[] words) {
    int[] diff1 = new int[words[0].length() - 1];
    int[] diff2 = new int[words[0].length() - 1];

    diff1 = getDifference(words[0]);
    diff2 = getDifference(words[1]);

    if (Arrays.equals(diff1, diff2)) {
      for (int i = 2; i < words.length; i++) {
        if (Arrays.equals(diff1, getDifference(words[i])) == false) {
          return words[i];
        }
      }
    }
    return Arrays.equals(diff1, getDifference(words[2])) ? words[1] : words[0];
  }

  public static void main(String[] args) {
    String[] words = { "adc", "wzy", "abc" };
    System.out.println(oddString(words));
  }
}
