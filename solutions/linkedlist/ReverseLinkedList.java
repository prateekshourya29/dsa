package solutions.linkedlist;

// https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
  ListNode h;

  // Using Recursion
  public ListNode reverse(ListNode head) {
    if (head == null || head.next == null) {
      h = head;
      return head;
    }
    
    ListNode prev = reverse(head.next);
    head.next = null;
    prev.next = head;
    return head;
  }

  public ListNode reverseListRecursion(ListNode head) {
    reverse(head);
    return h;
  }
  
  // Better and Faster approach.
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    
    while (curr != null) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    
    head = prev;
    return head;
  }
}
