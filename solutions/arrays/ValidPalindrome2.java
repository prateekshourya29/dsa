package solutions.arrays;

// https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindrome2 {
  public boolean isPalindrome(String s, int i, int j) {
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    
    return true;
  }
  
  public boolean validPalindrome(String s) {
    int l = 0, r = s.length() - 1;
    
    while (l < r) {
      if (s.charAt(l) != s.charAt(r)) {
        return (isPalindrome(s, l, r -1) || isPalindrome(s, l + 1, r));
      }
      l++;
      r--;
    }
    
    return true;
  }
}
