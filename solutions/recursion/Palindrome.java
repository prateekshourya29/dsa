package solutions.recursion;

public class Palindrome {
  public static boolean checkPalindrome(int n, int start, int end) {
    if (start <= end - 1) return true;

    int endDigit = (int) ((n % Math.pow(10, end)) / Math.pow(10, end - 1));
    int startDigit = (int) ((n / Math.pow(10, start)) % 10);
    
    return startDigit == endDigit ? checkPalindrome(n, start - 1, end + 1) : false;
  }

  public static boolean isPalindrome(int n) {
    int digits = (int) Math.log10(n);
    return checkPalindrome(n, digits, 1);
  }
  public static void main(String[] args) {
    System.out.println(isPalindrome(1234321));
  }
}
