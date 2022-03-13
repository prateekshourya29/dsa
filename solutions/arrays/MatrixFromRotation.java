package solutions.arrays;

// [Determine Whether Matrix Can Be Obtained By Rotation](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)
public class MatrixFromRotation {
	public boolean findRotation(int[][] mat, int[][] target) {
		int n = mat.length;
		int i, j, row, col;
		boolean flag = true;
		
		// Can also be done using 2 for loops
		for (i = 0, row = 0; i < n; i++, row++) {
			for (j = 0, col = 0; j < n; j++, col++) {
				if (mat[i][j] != target[row][col]) {
					flag = false;
					break;
				}
			}
			if (flag == false) break;
		}
		
		if (flag) return flag;
		
		flag = true;
		for (j = 0, row = 0; j < n; j++, row++) {
			for (i = n - 1, col = 0; i >= 0; i--, col++) {
				if (mat[i][j] != target[row][col]) {
					flag = false;
					break;
				}
			}
			if (flag == false) break;
		}
		
		if (flag) return flag;
		
		flag = true;
		for (j = n - 1, row = 0; j >= 0; j--, row++) {
			for (i = n - 1, col = 0; i >= 0; i--, col++) {
				if (mat[j][i] != target[row][col]) {
					flag = false;
					break;
				}
			}
			if (flag == false) break;
		}
		
		if (flag) return flag;
		
		flag = true;
		for (j = n - 1, row = 0; j >= 0; j--, row++) {
			for (i = 0, col = 0; i < n; i++, col++) {
				if (mat[i][j] != target[row][col]) {
					flag = false;
					break;
				}
			}
			if (flag == false) break;
		}
		
		return flag;
	}
}
