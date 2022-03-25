package solutions.sorting;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllDisappearedNumber {
  public List<Integer> findDisappearedNumbers(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correctIndex = arr[i] - 1;
      if (arr[i] != arr[correctIndex]) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
      } else {
        i++;
      }
    }
    
    ArrayList<Integer> ans = new ArrayList<>();
    for (i = 0; i < arr.length; i++) {
      if (arr[i] != i + 1) {
        ans.add(i + 1);
      }
    }
    
    return ans;
  }
}
