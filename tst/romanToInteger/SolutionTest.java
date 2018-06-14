package romanToInteger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test3() {
    String input = "III";
    int expected = 3;
    int actual = solution.romanToInt(input);

    assertEquals(expected, actual);
  }

  @Test
  public void test4() {
    String input = "IV";
    int expected = 4;
    int actual = solution.romanToInt(input);

    assertEquals(expected, actual);
  }

  @Test
  public void test9() {
    String input = "IX";
    int expected = 9;
    int actual = solution.romanToInt(input);

    assertEquals(expected, actual);
  }

  @Test
  public void test58() {
    String input = "LVIII";
    int expected = 58;
    int actual = solution.romanToInt(input);

    assertEquals(expected, actual);
  }

  @Test
  public void test1994() {
    String input = "MCMXCIV";
    int expected = 1994;
    int actual = solution.romanToInt(input);

    assertEquals(expected, actual);
  }

  @Test
  public void test100() {
    String input = "C";
    int expected = 100;
    int actual = solution.romanToInt(input);

    assertEquals(expected, actual);
  }
}
