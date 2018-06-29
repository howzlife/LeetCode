package generateParentheses;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void firstTest() {
    List<String> result = solution.generateParenthesis(1);

    assertEquals(1, result.size());
    assertEquals("()", result.get(0));
  }

  @Test
  public void secondTest() {
    List<String> actual = solution.generateParenthesis(2);

    List<String> expected = Arrays.asList(new String[]{"()()", "(())"});
    assertEquals(expected.size(), actual.size());
  }
}
