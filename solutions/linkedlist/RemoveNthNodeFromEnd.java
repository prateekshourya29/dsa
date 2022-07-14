package solutions.linkedlist;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEnd {
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
  
  public ListNode removeNthFromEnd(ListNode head, int n) {
    head = reverseList(head);
    
    if (n == 1) {
      head = head.next;
      return reverseList(head);
    }
    
    ListNode temp = head;
    
    for (int i = 1; i < n - 1 && temp != null; i++) {
      temp = temp.next;
    }
    
    if (temp != null && temp.next != null) {
      temp.next = temp.next.next; 
    }
    
    head = reverseList(head);
    
    return head;
  }
}
