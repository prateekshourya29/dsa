package solutions.strings;

// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class DecryptString {
  public static String freqAlphabets(String s) {
    for (int i = 10; i <= 26; i++) {
      char value = (char) (96 + i);
      s = s.replace(i + "#", String.valueOf(value));
    }

    for (int i = 1; i <= 9; i++) {
      char value = (char) (96 + i);
      s = s.replace(i + "", String.valueOf(value));
    }
    
    return s;
  }

  public static void main(String[] args) {
    String s = "10#11#12";
    System.out.println(freqAlphabets(s));
  }
}
