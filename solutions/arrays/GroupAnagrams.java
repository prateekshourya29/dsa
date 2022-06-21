package solutions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {
  public static List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> list = new ArrayList<>();
    HashMap<String, ArrayList<String>> map = new HashMap<>();

    for (String s: strs) {
      int[] arr = new int[26];
      for (char c: s.toCharArray()) {
        arr[c-97]++;
      }
      if (map.containsKey(Arrays.toString(arr))) {
        ArrayList<String> l = map.get(Arrays.toString(arr));
        l.add(s);
        map.replace(Arrays.toString(arr), l);
      } else {
        ArrayList<String> l = new ArrayList<>();
        l.add(s);
        map.put(Arrays.toString(arr), l);
      }
    }

    list.addAll(map.values());

    return list;
  }

  public static void main(String[] args) {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};
    System.out.println(groupAnagrams(strs));
  }
}
