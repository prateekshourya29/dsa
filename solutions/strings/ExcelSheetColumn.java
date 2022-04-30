package solutions.strings;

import java.util.ArrayList;

// https://leetcode.com/problems/excel-sheet-column-title/
public class ExcelSheetColumn {
  public static String convertToTitle(int columnNumber) {
    ArrayList<Integer> list = new ArrayList<>();
    StringBuilder ans = new StringBuilder();

    while (columnNumber > 0) {
      int val = columnNumber % 26;
      if (val == 0) val = 26;

      list.add(val);
      columnNumber -= val;
      columnNumber /= 26;
    }

    for (int i = list.size() - 1; i >= 0; i--) {
      ans.append((char)(list.get(i) + 64));
    }

    return ans.toString();
  }

  public static void main(String[] args) {
    System.out.println(convertToTitle(28));
  }
}
