package addTwoNumbers;

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;

    ListNode solutionHead = new ListNode(0);
    ListNode current = solutionHead;

    while (l1 != null || l2 != null) {
      current.val += carry;

      if (l1 != null) {
        current.val += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        current.val += l2.val;
        l2 = l2.next;
      }

      carry = current.val / 10;
      current.val = current.val % 10;
      if (l1 != null || l2 != null) {
        current.next = new ListNode(0);
        current = current.next;
      }
    }

    if (carry != 0) {
      current.next = new ListNode(carry);
    }

    return solutionHead;
  }
}

