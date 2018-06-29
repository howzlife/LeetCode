package permutations;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void firstTest() {
    int[] values = new int[]{1, 2, 3};

    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(new Integer[]{1, 2, 3}));
    expected.add(Arrays.asList(new Integer[]{1, 3, 2}));
    expected.add(Arrays.asList(new Integer[]{2, 1, 3}));
    expected.add(Arrays.asList(new Integer[]{2, 3, 1}));
    expected.add(Arrays.asList(new Integer[]{3, 1, 2}));
    expected.add(Arrays.asList(new Integer[]{3, 2, 1}));

    List<List<Integer>> actual = solution.permute(values);

    assertTrue(expected.equals(actual));
  }
}
