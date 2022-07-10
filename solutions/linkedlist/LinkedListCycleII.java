package solutions.linkedlist;

// https://leetcode.com/problems/linked-list-cycle-ii/
public class LinkedListCycleII {
  public ListNode detectCycle(ListNode head) {
    ListNode f = head;
    ListNode s = head;
    
    int cycleLength = 0;
    
    while (f != null && f.next != null) {
      f = f.next.next;
      s = s.next;
      if (f == s) {
        do {
          s = s.next;
          cycleLength++;
        } while (s != f);
        s = head;
        for (int i = 0; i < cycleLength; i++) {
          s = s.next;
        }

        f = head;
        while (f != s) {
          f = f.next;
          s = s.next;
        }
        return f;
      }
    }
    
    return null;
  }
}
