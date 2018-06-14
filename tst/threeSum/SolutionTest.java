package threeSum;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void firstTest() {
    int[] values = new int[]{-1,0,1,2,-1,-4};

    List<List<Integer>> expected = new ArrayList<>();
    expected.add(new ArrayList<>());
    expected.add(new ArrayList<>());

    expected.get(0).add(-1);
    expected.get(0).add(-1);
    expected.get(0).add(-2);
    expected.get(1).add(-1);
    expected.get(1).add(0);
    expected.get(1).add(-1);
    List<List<Integer>> actual = solution.threeSum(values);

    assertEquals(expected, actual);
  }
}
