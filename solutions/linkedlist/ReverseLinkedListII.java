package solutions.linkedlist;

// https://leetcode.com/problems/reverse-linked-list-ii/
public class ReverseLinkedListII {
  public ListNode reverseList(ListNode start, ListNode end) {
    ListNode prev = end.next;
    end.next = null;
    ListNode curr = start;
    
    while (curr != null) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    
    return prev;
  }

  public ListNode reverseBetween(ListNode head, int left, int right) {
    
    if (head.next == null) {
      return head;
    }
    
    ListNode start = null;
    ListNode end = null;
    ListNode beforeStart = null;
    ListNode prev = null;
    
    int count = 1;
    
    ListNode temp = head;
    
    while (temp != null && count <= right) {
      if (count == left) {
        start = temp;
        beforeStart = prev;
      }
      if (count == right) {
        end = temp;
      }
      prev = temp;
      temp = temp.next;
      count++;
    }
  
    if (beforeStart != null) {
      beforeStart.next = null;
      beforeStart.next = reverseList(start, end);
    } else {
      head = null;
      head = reverseList(start, end);
    }

    return head;
  }
}
