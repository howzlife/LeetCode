package longestValidParenthesesSubstring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

    @Test
    public void firstTest() {
      String input = "()()(())()(())";
      int expected = input.length();
      int actual = solution.longestValidParentheses(input);

      assertEquals(expected, actual);
    }

    @Test
    public void secondTest() {
      String input = "()(((((())())))";
      int expected = 12;
      int actual = solution.longestValidParentheses(input);

      assertEquals(expected, actual);
    }

    @Test
    public void thirdTest() {
      String input = ")()())";
      int expected = 4;
      int actual = solution.longestValidParentheses(input);

      assertEquals(expected, actual);
    }
}
