package solutions.recursion;

// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
public class FindKthBitInNthBinaryString {
  public static String reverse(String s) {
    StringBuffer buff = new StringBuffer(s);
    buff.reverse();
    return buff.toString();
  }

  public static String inverse(String s) {
    char[] inv = s.toCharArray();
    for (int i = 0; i < inv.length; i++) {
      if (inv[i] == '0') {
        inv[i] = '1';
      } else {
        inv[i] = '0';
      }
    }
    return String.valueOf(inv);
  }

  public static String findString(int n) {
    if (n == 1) {
      return "0";
    }

    String prev = findString(n - 1);
    return prev + "1" + reverse(inverse(prev));
  }

  public static char findKthBit(int n, int k) {
    String s = findString(n);
    return s.charAt(k - 1);
  }

  public static void main(String[] args) {
    int n = 20, k = 1048575;
    System.out.println(findKthBit(n, k));
  }
}
