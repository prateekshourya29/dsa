import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
public class KweakestRow {
  public int[] kWeakestRows(int[][] mat, int k) {
    int[][] ord = new int[mat.length][2];
    
    for (int i = 0; i < mat.length; i++) {
      int start = 0, end = mat[i].length - 1;
      while (start <= end) {
        int mid = start + (end - start) / 2;
        if (mat[i][mid] == 0) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
      
      ord[i][0] = end + 1;
      ord[i][1] = i;
    }
    
    Arrays.sort(ord, new Comparator<int[]>() {
      public int compare(int[] a, int[] b) {
        if (a[0] < b[0]) return -1;
        else if (a[0] > b[0]) return 1;
        else return a[1] - b[1];
      }
    });
    
    int[] ans = new int[k];
    for (int i = 0; i < k; i++) {
      ans[i] = ord[i][1];
    }
  
    return ans;
  }
}
