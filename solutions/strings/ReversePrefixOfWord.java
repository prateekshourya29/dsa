package solutions.strings;

// https://leetcode.com/problems/reverse-prefix-of-word/
public class ReversePrefixOfWord {
  public static void swap(char[] arr, int i, int j) {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void reverse(char[] arr, int start, int end) {
    while (start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }
  }
  
  public static String reversePrefix(String word, char ch) {
    char[] arr = word.toCharArray();
    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == ch) {
        reverse(arr, 0, i);
        break;
      }
    } 
    
    return String.valueOf(arr);
  }

  public static void main(String[] args) {
    String word = "abcdefd";
    char ch = 'd';
    System.out.println(reversePrefix(word, ch));
  }
}
