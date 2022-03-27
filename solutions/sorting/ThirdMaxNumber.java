package solutions.sorting;

// https://leetcode.com/problems/third-maximum-number/
public class ThirdMaxNumber {
  public int thirdMax(int[] nums) {
    int max = 0;
    int max2 = -1;
    int max3 = -1;
    
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > nums[max]) {
        max3 = max2;
        max2 = max;
        max = i;
      } else if ((max2 == -1 || nums[i] > nums[max2]) && nums[i] != nums[max]) {
        max3 = max2;
        max2 = i;
      } else if ((max3 == -1 || nums[i] > nums[max3]) && (nums[i] != nums[max] && nums[i] != nums[max2])) {
        max3 = i;
        
      }
    }
    
    return (max3 != -1) ? nums[max3] : nums[max];
  }
}
