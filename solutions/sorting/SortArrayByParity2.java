package solutions.sorting;

// https://leetcode.com/problems/sort-array-by-parity-ii/
public class SortArrayByParity2 {
  public void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
  
  public int[] sortArrayByParityII(int[] nums) {
    for (int i = 0, j = 1; i < nums.length;) {
      if (nums[i] % 2 == 0) {
        i += 2;
      } else if (nums[j] % 2 != 0) {
        j += 2;
      } else {
        swap(nums, i, j);
      }
    }
    
    return nums;
  }
}
