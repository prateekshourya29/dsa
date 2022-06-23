package solutions.recursion;

public class StringSubstring {
  public static void substr(String p, String up) {
    if (up.isEmpty()) {
      System.out.println(p);
      return;
    }
    substr(p + up.charAt(0), up.substring(1));
    substr(p, up.substring(1));
  }

  public static void main(String[] args) {
    substr("", "abc");
  }
}
