package longestPalindromicSubstring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void testOddSolution() {
    String value = "babad";
    String expected = "aba";
    String actual = solution.longestPalindrome(value);

    assertEquals(expected, actual);
  }

  @Test
  public void testEvenSolution() {
    String value = "babbad";
    String expected = "abba";
    String actual = solution.longestPalindrome(value);

    assertEquals(expected, actual);
  }
}
