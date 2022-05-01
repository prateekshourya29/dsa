package solutions.strings;

// https://leetcode.com/problems/implement-strstr/
public class StringStr {
  public static int strStr(String haystack, String needle) {
    int needleSize = needle.length();
    if (needleSize == 0) return 0;

    int idx = -1;
    int i = 0;

    for (int j = 0; j < haystack.length(); j++) {
      if (haystack.charAt(j) == needle.charAt(i)) {
        if (idx == -1) idx = j;
        i++;
        if (i == needleSize) return idx;
      } else {
        if (idx != -1) {
          j = idx;
          idx = -1;
          i = 0;
        }
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    String haystack = "mississippi", needle = "pi";
    System.out.println(strStr(haystack, needle));
  }
}
