package validParentheses;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void firstTest() {
    String input = "{}{}{{{[()]{}}}}";
    boolean expected = true;
    boolean actual = solution.isValid(input);

    assertEquals(expected, actual);
  }

  @Test
  public void secondTest() {
    String input = "{}{{{{[()]{}}}}";
    boolean expected = false;
    boolean actual = solution.isValid(input);

    assertEquals(expected, actual);
  }
}
