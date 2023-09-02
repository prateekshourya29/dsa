package solutions.patterns;

public class Patterns {
  static void pattern1(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern2(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern3(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n - row + 1; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern4(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }

  static void pattern5(int n) {
    for (int row = 1; row <= 2 * n - 1; row++) {
      int totalNoOfColumn = row > n ? 2 * n - row : row;
      for (int col = 1; col <= totalNoOfColumn; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern6(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n; col++) {
        if (col <= n - row)
          System.out.print(" ");
        else
          System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern7(int n) {
    for (int row = n; row >= 1; row--) {
      for (int col = 1; col <= n; col++) {
        if (col <= n - row)
          System.out.print(" ");
        else
          System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern8(int n) {
    for (int row = 1; row <= n; row++) {
      int totalNoOfSpace = n - row;
      for (int j = 1; j <= totalNoOfSpace; j++) {
        System.out.print(" ");
      }
      int totalNoOfColumn = 2 * row - 1;
      for (int col = 1; col <= totalNoOfColumn; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern9(int n) {
    for (int row = n; row >= 1; row--) {
      int totalNoOfSpace = n - row;
      for (int j = 1; j <= totalNoOfSpace; j++) {
        System.out.print(" ");
      }
      int totalNoOfColumn = 2 * row - 1;
      for (int col = 1; col <= totalNoOfColumn; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern10(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n; col++) {
        if (row < n - col + 1)
          System.out.print(" ");
        else
          System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern11(int n) {
    for (int row = n; row >= 1; row--) {
      for (int col = 1; col <= n; col++) {
        if (row < n - col + 1)
          System.out.print(" ");
        else
          System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern12(int n) {
    pattern11(n);
    pattern10(n);
  }

  static void pattern28(int n) {
    for (int row = 1; row <= 2 * n - 1; row++) {
      int totalNoOfSpace = Math.abs(row - n);
      for (int col = 1; col <= n; col++) {
        if (col <= totalNoOfSpace)
          System.out.print(" ");
        else
          System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern31(int n) {
    n = 2 * n;
    for (int row = 1; row < n; row++) {
      for (int col = 1; col < n; col++) {
        int l = row;
        int r = n - row;
        int u = col;
        int d = n - col;
        int value = Math.min(Math.min(l, r), Math.min(u, d));
        System.out.print(((n / 2) - value + 1) + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern1(5);
    System.out.println();
    pattern2(5);
    System.out.println();
    pattern3(5);
    System.out.println();
    pattern4(5);
    System.out.println();
    pattern5(5);
    System.out.println();
    pattern6(5);
    System.out.println();
    pattern7(5);
    System.out.println();
    pattern8(5);
    System.out.println();
    pattern9(5);
    System.out.println();
    pattern10(5);
    System.out.println();
    pattern11(5);
    System.out.println();
    pattern31(9);
  }
}
