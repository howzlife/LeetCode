package reverseNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void reverseTest() {
    int x = 1534236469;

    int expected = 0;
    int actual = solution.reverse(x);

    assertEquals(expected, actual);
  }

  @Test
  public void reverseTestNegative() {
    int x = -2147483648;

    int expected = 0;
    int actual = solution.reverse(x);

    assertEquals(expected, actual);
  }
}
