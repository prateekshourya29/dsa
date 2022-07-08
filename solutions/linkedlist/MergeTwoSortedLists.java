package solutions.linkedlist;

// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;
    
    boolean startFirst = list1.val < list2.val ? true : false;
    ListNode t1 = startFirst ? list1 : list2;
    ListNode t2 = startFirst ? list2 : list1;
    
    while (t1.next != null && t2 != null) {
      if (t1.next.val > t2.val) {
        ListNode t = t2;
        t2 = t2.next;
        t.next = t1.next;
        t1.next = t;
      }
      t1 = t1.next;
    }
    if (t2 != null) {
      t1.next = t2; 
    }
    
    return startFirst ? list1 : list2;
  }
}
