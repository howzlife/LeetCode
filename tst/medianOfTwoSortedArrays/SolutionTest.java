package medianOfTwoSortedArrays;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  Solution solution;

  @Before
  public void before() {
    solution = new Solution();
  }

  @Test
  public void testEvenSizedArrays() {
    int[] first = new int[]{1, 3, 5};
    int[] second = new int[]{2, 4, 6};

    Double answer = solution.findMedianSortedArrays(first, second);

    assertEquals(new Double(3.5), answer);
  }

  @Test
  public void testOddSizedArrays() {
    int[] first = new int[]{1, 3, 5};
    int[] second = new int[]{2, 4};

    Double answer = solution.findMedianSortedArrays(first, second);

    assertEquals(new Double(3), answer);
  }

  @Test
  public void testEvenSizedTestArray() {
    int[] first = new int[]{1, 2};
    int[] second = new int[]{3, 4};

    Double answer = solution.findMedianSortedArrays(first, second);

    assertEquals(new Double(2.5), answer);
  }
}
