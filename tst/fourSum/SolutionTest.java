package fourSum;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void firstTest() {
    int[] values = new int[]{1, 0, -1, 0, -2, 2};

    List<List<Integer>> expected = new ArrayList<>();
    List<Integer> first = new ArrayList<>();
    first.add(-1);
    first.add(0);
    first.add(0);
    first.add(1);

    expected.add(first);
    List<List<Integer>> actual = solution.fourSum(values, 0);
    assertEquals(expected, actual);
  }
}
