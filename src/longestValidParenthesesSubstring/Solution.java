package longestValidParenthesesSubstring;

import java.util.Stack;

public class Solution {

  public int longestValidParentheses(String s) {

    if (s == null || s.length() == 0) return 0;

    Stack<Integer> stack = new Stack<>();
    boolean[] results = new boolean[s.length()];

//    Create boolean array and put 'true' at positions of valid open and close brackets
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        stack.push(i);
      } else {
        if (stack.size() > 0) {
          results[i] = true;
          results[stack.pop()] = true;
        }
      }
    }

//    Find longest subsequence of 'true' values in results array
    int count = 0, max = 0;
    for (int i = 0; i < results.length; i++) {
      if (results[i]) {
        count++;
      } else {
        max = Math.max(count, max);
        count = 0;
      }
    }

    return Math.max(max, count);
  }
}

