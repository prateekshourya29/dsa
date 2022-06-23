package solutions.linkedlist;

// Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicates {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      while (temp.next != null && temp.val == temp.next.val) {
        temp.next = temp.next.next;
      }
      temp = temp.next;
    }
    return head;
  }
}
