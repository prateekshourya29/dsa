package solutions.strings;

// https://leetcode.com/problems/percentage-of-letter-in-string/
public class PercentageOfLetterInString {
  public static int percentageLetter(String s, char letter) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == letter) count++;
    }

    return (int) (count * 100 ) / s.length();
  }

  public static void main(String[] args) {
    String s = "foobar";
    char letter = 'o';
    System.out.println(percentageLetter(s, letter));
  }
}
