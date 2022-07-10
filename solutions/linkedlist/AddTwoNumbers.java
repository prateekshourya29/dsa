package solutions.linkedlist;

// https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = null;
    ListNode prev = null;
    int carry = 0;
    while (l1 != null || l2 != null) {
      int sum = 0;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }
      sum += carry;
      carry = 0;
      if (sum > 9) {
        carry = 1;
        sum %= 10;
      }
      
      ListNode node = new ListNode(sum);
      if (head == null) {
        head = node;
        prev = node;
      } else {
        prev.next = node;
        prev = node;
      }
    }
    
    if (carry == 1) {
      ListNode node = new ListNode(carry);
      prev.next = node;
    }
    
    return head;
  }
}
