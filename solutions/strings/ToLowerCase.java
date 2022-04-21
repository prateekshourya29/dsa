package solutions.strings;

// https://leetcode.com/problems/to-lower-case/
public class ToLowerCase {
  public static String toLowerCase(String s) {
    char[] arr = s.toCharArray();

    for (int i = 0; i < arr.length; i++) {
      char ch = arr[i];
      if (ch >= 'A' && ch <= 'Z') {
        ch += 32;
        arr[i] = ch;
      }
    }
    
    return String.valueOf(arr);
  }
  
  public static void main(String[] args) {
    String s = "Hello";
    System.out.println(toLowerCase(s));
  }
}
