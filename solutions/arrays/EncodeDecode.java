package solutions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.lintcode.com/problem/659/
public class EncodeDecode {
  /*
    * @param strs: a list of strings
    * @return: encodes a list of strings to a single string.
    */
  public static String encode(List<String> strs) {
      // write your code here
      String str = String.join(";:;#", strs);
      return str;
  }

  /*
    * @param str: A string
    * @return: dcodes a single string to a list of strings
    */
  public static List<String> decode(String str) {
      // write your code here
      String[] strs = str.split(";:;#");

      return Arrays.asList(strs);
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
