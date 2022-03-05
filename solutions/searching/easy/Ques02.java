package solutions.searching.easy;

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
*               otherwise return 0
* int guess(int num);
*/

public class Ques02 {
  int guess(int num) {return 0;} // Dummy code to remove syntax error
  public int guessNumber(int n) {
    int start = 1, end = n, mid = -1;
    
    while (start <= end) {
      mid = start + (end - start) / 2;
      int value = guess(mid);
      if (value == 0) return mid;
      else if (value == -1) end = mid - 1;
      else if (value == 1) start = mid + 1;
    }
    
    return mid;
  }
}
