package longestCommonPrefix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void testPrefixes() {
    String[] values = new String[]{"flower", "flowered", "flowering", "flex"};

    String expected = "fl";
    String actual = solution.longestCommonPrefix(values);

    assertEquals(expected, actual);
  }

  @Test
  public void testPrefixesWithEmptyArray() {
    String[] values = new String[]{""};

    String expected = "";
    String actual = solution.longestCommonPrefix(values);

    assertEquals(expected, actual);
  }

  @Test
  public void testPrefixesWithSameSingleLetterValue() {
    String[] values = new String[]{"c", "c"};

    String expected = "c";
    String actual = solution.longestCommonPrefix(values);

    assertEquals(expected, actual);
  }
}
