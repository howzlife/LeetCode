package addTwoNumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testAddTwoNumbers() {
    Solution solution = new Solution();

    ListNode firstHead = getListNodeList(new int[]{2, 4, 3});
    ListNode secondHead = getListNodeList(new int[]{5, 6, 7});

    ListNode expected = getListNodeList(new int[]{7, 0, 1, 1});
    ListNode actual = solution.addTwoNumbers(firstHead, secondHead);

    while (expected != null || actual != null) {
      assertEquals(expected.val, actual.val);
      expected = expected.next;
      actual = actual.next;
    }

    if (expected != null || actual != null) {
      fail();
    }
  }

  @Test
  public void testAddTwoNumbersUnevenLength() {
    Solution solution = new Solution();

    ListNode firstHead = getListNodeList(new int[]{2, 4, 3});
    ListNode secondHead = getListNodeList(new int[]{5, 6});

    ListNode expected = getListNodeList(new int[]{7, 0, 4});
    ListNode actual = solution.addTwoNumbers(firstHead, secondHead);

    while (expected != null && actual != null) {
      assertEquals(expected.val, actual.val);
      expected = expected.next;
      actual = actual.next;
    }

    if (actual != null || expected != null) {
      fail();
    }
  }

  private ListNode getListNodeList(int[] values) {
    ListNode head = new ListNode(values[0]);
    ListNode node = head;

    for (int i = 0; i < values.length; i++) {
      node.next = new ListNode(values[i]);
      node = node.next;
    }

    return head;
  }


}
