package solutions.strings;

// https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class HalvesAreAlike {
  public static boolean halvesAreAlike(String s) {
    s = s.toLowerCase();

    int len = s.length();
    char[] left = s.substring(0, len / 2).toCharArray();
    char[] right = s.substring(len / 2, len).toCharArray();

    int countL = 0;
    for (char c: left) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        countL++;
      }
    }

    int countR = 0;
    for (char c: right) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        countR++;
      }
    }

    return countL == countR;
  }

  public static void main(String[] args) {
    String s = "Book";
    System.out.println(halvesAreAlike(s));
  }
}
