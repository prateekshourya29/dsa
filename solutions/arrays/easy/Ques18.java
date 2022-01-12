package solutions.arrays.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ques18 {
  // [Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)
  class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int carry = 0;
        ArrayList<Integer> arr = new ArrayList<>(n + 1);
        while (n > 0 || k > 0) {
            int val;
            if (n > 0) {
                val = num[n-1] + k % 10 + carry;
            } else {
                val = k % 10 + carry;
            }
            carry = 0;
            if (val > 9) {
                val %= 10;
                carry = 1;
            }
            n--;
            k /= 10;
            arr.add(val);
        }
        if (carry == 1) arr.add(1);
        Collections.reverse(arr);
        return arr;
    }
  }
}
