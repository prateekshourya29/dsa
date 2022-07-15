package solutions.linkedlist;

// https://leetcode.com/problems/rotate-list/
public class RotateList {
  // Best Approach
  public ListNode rotateRightBest(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
      return head;
    }
    
    int n = 1;
    ListNode end = head;
    
    while (end.next != null) {
      end = end.next;
      n++;
    }
    
    k = k % n;
    
    if (k == 0) return head;
    
    ListNode start = head;
    for (int i = 1; i < n - k; i++) {
      start = start.next;
    }
    
    ListNode temp = start.next;
    start.next = null;
    end.next = head;
    head = temp;
    
    return head;
  }

	// Simple Solution
	public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null) {
      return head;
    }
    
    int n = 0;
    ListNode temp = head;
    while (temp != null) {
      temp = temp.next;
      n++;
    }
    
    k = k % n;
    
    while (k-- > 0) {
      ListNode end = head;
      ListNode prev = null;
      
      while (end != null && end.next != null) {
        prev = end;
        end = end.next;
      }
      
      prev.next = null;
      end.next = head;
      head = end;
    }
    
    return head;
  }

	// Using Reverse  
  public ListNode rotateRightUsingReverse(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
      return head;
    }
    
    int n = 1;
    ListNode start = head;
    ListNode end = head;
    
    while (end.next != null) {
      end = end.next;
      n++;
    }
    
    k = k % n;
    
    if (k == 0) return head;
    
    head = reverseList(start, end);
    
    ListNode first = end;
    ListNode second = start;
    ListNode firstEnd = first;
    ListNode secondStart = null;
    
    n = 1;
    while (n < k) {
      firstEnd = firstEnd.next;
      n++;
    }
    secondStart = firstEnd.next;
    
    head = reverseList(first, firstEnd);
    first.next = reverseList(secondStart, second);
    
    return head;
  }

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
}
