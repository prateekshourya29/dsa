package solutions.strings;

// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
  public static String removeChar(String s) {
    StringBuilder str = new StringBuilder();

    for (char c: s.toCharArray()) {
      if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
        str.append(c);
      }
    }

    return str.toString();
  }

  public static boolean isPalindrome(String s) {
    s = s.toLowerCase();
    s = removeChar(s);
    
    int i = 0, j = s.length() - 1;
    while (i < j) {
      if (s.charAt(i) == s.charAt(j)) {
        i++;
        j--;
      } else {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    String s = " ";
    System.out.println(isPalindrome(s));
  }
}
