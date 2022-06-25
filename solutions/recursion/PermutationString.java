package solutions.recursion;

import java.util.ArrayList;

public class PermutationString {
  public static ArrayList<String> permutation(String p, String up) {
    ArrayList<String> l = new ArrayList<>();
    if (up.isEmpty()) {
      l.add(p);
      return l;
    }

    int len = p.length();
    char ch = up.charAt(0);
    for (int i = 0; i <= len; i++) {
      ArrayList<String> s = permutation(p.substring(0, i) + ch + p.substring(i), up.substring(1));
      l.addAll(s);
    }

    return l;
  }

  public static void main(String[] args) {
    System.out.println(permutation("", "abc"));
  }
}
