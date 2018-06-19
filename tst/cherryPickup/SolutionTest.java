package cherryPickup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void validTest() {
    int[][] input = new int[][]{{0, 1, -1},{1, 0, -1}, {1, 1, 1}};

    int expected = 5;
    int actual = solution.cherryPickup(input);
    assertEquals(expected, actual);
  }

  @Test
  public void validTest2() {
    int[][] input = new int[][]{{0, 1, 1, 0, 0}, {1, 1, 1, 1, 0}, {-1, 1, 1, 1, -1}, {0, 1, 1, 1, 0}, {1, 0, -1, 0, 0}};

    int expected = 11;
    int actual = solution.cherryPickup(input);
    assertEquals(expected, actual);
  }

  @Test
  public void invalidTest() {
    int[][] input = new int[][]{{0, 1, -1},{1, 0, -1}, {1, 1, -1}};

    int expected = 0;
    int actual = solution.cherryPickup(input);

    assertEquals(expected, actual);
  }
}
