package zigzagConversion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  String input = "PAYPALISHIRING";
  Solution solution = new Solution();

  @Test
  public void testWith2Rows() {
    String expected = "PYAIHRNAPLSIIG";
    String actual = solution.convert(input, 2);

    assertEquals(expected, actual);
  }

  @Test
  public void testWith3Rows() {
    String expected = "PAHNAPLSIIGYIR";
    String actual = solution.convert(input, 3);

    assertEquals(expected, actual);
  }

  @Test
  public void testWith4Rows() {
    String expected = "PINALSIGYAHRPI";
    String actual = solution.convert(input, 4);

    assertEquals(expected, actual);
  }
}
