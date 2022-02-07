package solutions.arrays.medium;

public class Ques05 {
  // [Jump Game](https://leetcode.com/problems/jump-game/)
  class Solution {
    public boolean canJump(int[] nums) {
        int sumSteps=0;
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            sumSteps=sumSteps<nums[i] ? nums[i] : sumSteps;
            if(sumSteps==0){
                return false;
            }
            sumSteps--;
        }
        return true;
    }
  }
}
