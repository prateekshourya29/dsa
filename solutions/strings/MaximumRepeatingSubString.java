package solutions.strings;

// https://leetcode.com/problems/maximum-repeating-substring/
public class MaximumRepeatingSubString {
  public static int maxRepeating(String sequence, String word) {
    int count = -1;
    
    StringBuilder s = new StringBuilder();
    
    do {
      count++;
      s.append(word);
    } while(sequence.contains(s));
    
    return count;
  }

  public static void main(String[] args) {
    String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba", word = "aaaba";
    System.out.println(maxRepeating(sequence, word));
  }
}
