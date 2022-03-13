package solutions.arrays;

// [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
public class IsPanagram {
  public boolean checkIfPangram(String sentence) {
      int[] arr = new int[26];
      for (char ch: sentence.toCharArray()) {
          if (ch >= 97 && ch <= 122) {
              arr[ch - 97] = 1;
          }
      }
      boolean flag = true;
      for (int i = 0; i < 26; i++) {
          if (arr[i] != 1) {
              flag = false;
              break;
          }
      }
      return flag;
  }
}
