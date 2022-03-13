package solutions.searching;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class NextGreatestLetter {
  public static char nextGreatestLetter(char[] letters, char target) {
    int start = 0;
    int end = letters.length - 1;
  
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (letters[mid] == target) {
        start = mid + 1;
        break;
      } else if (letters[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    
    return letters[start % letters.length];
  }

  public static void main(String[] args) {
    System.out.println(nextGreatestLetter(new char[] {'c','f','j'}, 'k'));
  }
}