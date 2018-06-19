package removeNthNodeFromEnd;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

      ListNode temp = head;

      for (int i = 0; i < n; i++) {
        if (temp.next == null) {
          head = head.next;
          return head;
        }
        temp = temp.next;
      }

      ListNode next = head;

      while (temp.next != null) {
        temp = temp.next;
        next = next.next;
      }

      temp = next.next;

      next.next = next.next.next;
      temp.next = null;

      return head;
    }
}
