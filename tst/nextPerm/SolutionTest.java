package nextPerm;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void firstTest() {
    int[] first = new int[]{1, 2, 3};
    int[] expected = new int[]{1, 3, 2};

    solution.nextPermutation(first);

    assertTrue(Arrays.equals(expected, first));
  }

  @Test
  public void secondTest() {
    int[] second = new int[]{3, 2, 1};
    int[] expected = new int[]{1, 2, 3};

    solution.nextPermutation(second);

    assertTrue(Arrays.equals(expected, second));
  }

  @Test
  public void thirdTest() {
    int[] third = new int[]{4, 3, 1, 2};
    int[] expected = new int[]{4, 3, 2, 1};

    solution.nextPermutation(third);

    assertTrue(Arrays.equals(expected, third));
  }

}
