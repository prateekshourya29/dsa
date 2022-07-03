package solutions.linkedlist;

// Definition for singly-linked list.
class ListN {
  int val;
  ListN next;
  ListN() {}
  ListN(int val) { this.val = val; }
  ListN(int val, ListN next) { this.val = val; this.next = next; }
}

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicates {
  public ListN deleteDuplicates(ListN head) {
    ListN temp = head;
    while (temp != null) {
      while (temp.next != null && temp.val == temp.next.val) {
        temp.next = temp.next.next;
      }
      temp = temp.next;
    }
    return head;
  }
}
