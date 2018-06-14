package integerToRoman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test3() {
    int input = 3;

    String expected = "III";
    String actual = solution.intToRoman(input);

    assertEquals(expected, actual);
  }

  @Test
  public void test4() {
    int input = 4;

    String expected = "IV";
    String actual = solution.intToRoman(input);

    assertEquals(expected, actual);
  }

  @Test
  public void test9() {
    int input = 9;

    String expected = "IX";
    String actual = solution.intToRoman(input);

    assertEquals(expected, actual);
  }

  @Test
  public void test58() {
    int input = 58;

    String expected = "LVIII";
    String actual = solution.intToRoman(input);

    assertEquals(expected, actual);
  }

  @Test
  public void test1994() {
    int input = 1994;

    String expected = "MCMXCIV";
    String actual = solution.intToRoman(input);

    assertEquals(expected, actual);
  }

  @Test
  public void test100() {
    int input = 100;

    String expected = "C";
    String actual = solution.intToRoman(input);

    assertEquals(expected, actual);
  }
}
