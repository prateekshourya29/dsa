package solutions.strings;

// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
public class StringSubString {
  public static int numOfStrings(String[] patterns, String word) {
    int count = 0;

    for (String p: patterns) {
      if (word.contains(p)) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    String[] patterns = new String[] {"a","abc","bc","d"};
    String word = "abc";

    System.out.println(numOfStrings(patterns, word));
  }
}
