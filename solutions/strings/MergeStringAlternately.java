package solutions.strings;

// https://leetcode.com/problems/merge-strings-alternately/
public class MergeStringAlternately {
  public static String mergeAlternately(String word1, String word2) {
    int n1 = word1.length();
    int n2 = word2.length();
    
    StringBuilder ans = new StringBuilder();
    
    int i = 0;
    while (i < n1 && i < n2) {
      ans.append(word1.charAt(i));
      ans.append(word2.charAt(i));
      i++;
    }
    
    while (i < n1) {
      ans.append(word1.charAt(i));
      i++;
    }
    
    while (i < n2) {
      ans.append(word2.charAt(i));
      i++;
    }
    
    return ans.toString();
  }

  public static void main(String[] args) {
    String word1 = "abcd", word2 = "pq";
    System.out.println(mergeAlternately(word1, word2));
  }
}
