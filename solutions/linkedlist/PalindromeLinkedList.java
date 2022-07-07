package solutions.linkedlist;

// https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {
  public boolean isPalindrome(ListNode head) {
    int n = 0;
    ListNode temp = head;
    
    while (temp != null) {
      temp = temp.next;
      n++;
    }
    
    int[] arr = new int[n];
    temp = head;
    int i = 0;
    
    while (temp != null) {
      arr[i++] = temp.val;
      temp = temp.next;
    }
    
    i = 0;
    int j = n - 1;
    
    while (i < j) {
      if (arr[i] != arr[j]) {
        return false;
      }
      i++;
      j--;
    }
    
    return true;
  }
}
