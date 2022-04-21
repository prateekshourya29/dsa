package solutions.strings;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class CheckIfTwoStringAreEqual {
  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    StringBuilder str1 = new StringBuilder();
    for (String w: word1) {
      str1.append(w);
    }

    StringBuilder str2 = new StringBuilder();
    for (String w: word2) {
      str2.append(w);
    }
    
    return str1.toString().equals(str2.toString());
  }

  public static void main(String[] args) {
    String[] word1 = new String[] {"ab", "c"};
    String[] word2 = new String[] {"a", "bc"};
    System.out.println(arrayStringsAreEqual(word1, word2));
  }
}
