package solutions.strings;

// https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
  public static int lengthOfLastWord(String s) {
    s = s.trim();
    int n = s.length() - 1;
    
    int count = 0;
    while (n >= 0) {
      if (s.charAt(n) == ' ') break;
      count++;
      n--;
    }
    
    return count;
  }

  public static void main(String[] args) {
    String s = "   fly me   to   the moon  ";
    System.out.println(lengthOfLastWord(s));
  }
}
