package solutions.extra;

import java.util.HashSet;

public class CountPairsOfSimilarStrings {
  public static boolean isSimilar(String a, String b) {
    HashSet<Character> s1 = new HashSet<>();
    for (char c : a.toCharArray()) {
      s1.add(c);
    }

    HashSet<Character> s2 = new HashSet<>();
    for (char c : b.toCharArray()) {
      s2.add(c);
    }

    for (char c : b.toCharArray()) {
      if (s1.contains(c)) {
        s1.remove(c);
      }
    }

    for (char c : a.toCharArray()) {
      if (s2.contains(c)) {
        s2.remove(c);
      }
    }

    return s1.isEmpty() && s2.isEmpty();
  }

  public static int similarPairs(String[] words) {
    int ans = 0;

    for (int i = 0; i < words.length - 1; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (isSimilar(words[i], words[j])) {
          System.out.println(words[i] + " " + words[j]);
          ans++;
        }
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    String[] words = { "nba", "cba", "dba" };
    System.out.println(similarPairs(words));
  }
}
