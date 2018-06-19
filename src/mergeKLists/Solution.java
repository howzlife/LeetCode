package mergeKLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public ListNode mergeKLists(ListNode[] lists) {

    List<ListNode> nodes = new ArrayList<ListNode>(Arrays.asList(lists));

    for (int i = 0; i < lists.length; i++) {
      if (lists[i] == null) continue;
      nodes.add(lists[i]);
    }

    ListNode newList = new ListNode(0);
    ListNode head = newList;

    while (nodes.size() > 0) {
      int min = nodes.get(0).val;
      int minIndex = 0;
      for (int i = 0; i < nodes.size(); i++) {
        while (i < nodes.size() && lists[i] == null) {
          nodes.remove(i);
        };

        if (nodes.get(i).val < min) {
          min = nodes.get(i).val;
          minIndex = i;
        }
      }
      newList.next = nodes.get(minIndex);
      newList = newList.next;
      nodes.set(minIndex, nodes.get(minIndex).next);
    }

    return head.next;
  }
}