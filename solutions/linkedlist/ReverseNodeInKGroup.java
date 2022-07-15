package solutions.linkedlist;

// https://leetcode.com/problems/reverse-nodes-in-k-group/
public class ReverseNodeInKGroup {
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
  
  public ListNode reverseKGroup(ListNode head, int k) {
    if (head.next == null) {
      return head;
    }
    
    ListNode prev = null;
    ListNode start = head;
    ListNode end = head;
    
    int n = 1;
    
    while (end != null) {
      if (n % k == 0) {
        ListNode temp = reverseList(start, end);
        if (prev == null) {
          head = temp;
        } else {
          prev.next = temp;
        }
        end = start;
        prev = end;
        start = end.next;
      }
      n++;
      end = end.next;
    }
    
    return head;
  }
}
