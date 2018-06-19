package removeNthNodeFromEnd;

import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  //TODO
  @Test
  public void firstTest() {
    ListNode head = new ListNode(1);
    ListNode current = head;

    for (int i = 0; i < 10; i++) {
      current.next = new ListNode(i);
      current = current.next;
    }
  }
}
