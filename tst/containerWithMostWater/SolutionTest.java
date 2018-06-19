package containerWithMostWater;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void firstTest() {
    int[] first = new int[]{1, 1};

    int expected = 1;
    int actual = solution.maxArea(first);

    assertEquals(expected, actual);
  }

  @Test
  public void secondTest() {
    int[] first = new int[]{1, 2, 1};

    int expected = 2;
    int actual = solution.maxArea(first);

    assertEquals(expected, actual);
  }

  @Test
  public void thirdTest() {
    int[] first = new int[]{1, 2, 1, 4, 1, 2};

    int expected = 8;
    int actual = solution.maxArea(first);

    assertEquals(expected, actual);
  }
}
