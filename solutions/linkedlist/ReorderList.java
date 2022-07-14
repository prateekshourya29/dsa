package solutions.linkedlist;

// https://leetcode.com/problems/reorder-list/
public class ReorderList {
  public ListNode reverseList(ListNode start, ListNode end) {
    ListNode prev = null;
    ListNode curr = start;

    while (curr != null) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }
  
  public void reorderList(ListNode head) {
    if (head.next == null || head.next.next == null) {
      return;
    }
    
    ListNode fast = head;
    ListNode slow = head;
    
    while (fast != null && fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    
    while (fast != null && fast.next != null) {
      fast = fast.next;
    }
    
    ListNode list2 = slow.next;
    slow.next = null;
    
    list2 = reverseList(list2, fast);
    
    ListNode temp = head;
    
    while (temp != null) {
      if (list2 == null) {
        break;
      }
      ListNode node = list2;
      list2 = list2.next;
      node.next = temp.next;
      temp.next = node;
      temp = temp.next.next;
    }
  }
}
