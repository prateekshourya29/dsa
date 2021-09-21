package solutions.arrays.easy;

public class Ques04 {
  // [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)
  public int maximumWealth(int[][] accounts) {
    int maximum_wealth = -1;
    for (int row = 0; row < accounts.length; row++) {
        int wealth = 0;
        for (int col = 0; col < accounts[row].length; col++) {
            wealth += accounts[row][col];   
        }
        if (wealth > maximum_wealth) 
            maximum_wealth = wealth;
    }
    return maximum_wealth;
}
}
