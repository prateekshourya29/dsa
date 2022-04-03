package solutions.arrays;

import java.util.Arrays;

// [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)
public class NumberSmallerThanCurrentNumber {
	public int[] smallerNumbersThanCurrent(int[] nums) {
			int n = nums.length;
			int[] arr = nums.clone();
			Arrays.sort(arr);
			
			int[] ans = new int[n];
			int i = 0;
			for (int a: nums) {
				int start = 0;
				int end = n - 1;
				
				while (start <= end) {
					int mid = start + (end - start) / 2;
					if (arr[mid] >= a) {
						end = mid - 1;
					} else {
						start = mid + 1;
					}
				}
				
				ans[i++] = start;
			}
			
			return ans;
		}
}
