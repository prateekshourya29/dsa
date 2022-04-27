package solutions.strings;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseWordInString {
  public static String reverse(String s) {
    char[] arr = s.toCharArray();
    int n = arr.length;

    for (int i = 0; i < n / 2; i++) {
      char temp = arr[i];
      arr[i] = arr[n - 1- i];
      arr[n - 1 - i] = temp;
    }

    return String.valueOf(arr);
  }

  public static String reverseWords(String s) {
    String[] str = s.split(" ");
    StringBuilder ans =  new StringBuilder();

    for (String st: str) {
      ans.append(reverse(st) + " ");
    }

    return ans.toString().strip();
  }

  public static void main(String[] args) {
    String s = "Let's take LeetCode contest";
    System.out.println(reverseWords(s));
  }
}
