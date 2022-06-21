package solutions.arrays;

import java.util.ArrayList;
import java.util.List;

// https://www.lintcode.com/problem/659/
public class EncodeDecode {
  /*
    * @param strs: a list of strings
    * @return: encodes a list of strings to a single string.
    */
  public static String encode(List<String> strs) {
      // write your code here
      StringBuilder str = new StringBuilder();

      for (String s: strs) {
        str.append(s.length() + "#" + s);
      }

      return String.valueOf(str);
  }

  /*
    * @param str: A string
    * @return: dcodes a single string to a list of strings
    */
  public static List<String> decode(String str) {
      // write your code here
      List<String> strs = new ArrayList<>();
      int i = 0;

      while (i < str.length()) {
        int j = i;
        while (str.charAt(j) != '#') {
          j++;
        }
        int len = Integer.parseInt(str.substring(i, j));
        strs.add(str.substring(j + 1, j + 1 + len));
        i = j + 1 + len;
      }

      return strs;
  }

  public static void main(String[] args) {
    List<String> strs = new ArrayList<>();
    strs.add("lint");
    strs.add("love");
    
    String str = encode(strs);
    System.out.println(str);
    List<String> s = decode(str);
    System.out.println(s);
  }
}
