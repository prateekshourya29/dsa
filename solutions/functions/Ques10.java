package solutions.functions;

import java.util.Scanner;

public class Ques10 {
  // Write a function to find if a number is a palindrome or not. Take number as parameter.
  public static boolean isPalindrome(int num) {
    int temp = num;
    int rev = 0;

    while (temp != 0) {
      rev = rev * 10 + temp % 10;
      temp /= 10;
    }

    if (num == rev) return true;
    return false;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = in.nextInt();

    if (isPalindrome(num)) System.out.println("It's a Palindrome!");
    else System.out.println("It's not a Palindrome!");

    in.close();
  }
}
