package solutions.strings;

public class CheckOneSegment {
  public static boolean checkOnesSegment(String s) {
    boolean flag = false;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == '0') flag = true;
      if (flag && s.charAt(i) == '1') return false;
    }
    
    return true;
  }

  public static void main(String[] args) {
    String s = "1110";
    System.out.println(checkOnesSegment(s));
  }
}
