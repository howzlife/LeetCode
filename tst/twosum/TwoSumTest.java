import static org.junit.Assert.*;
import twosum.TwoSum;

import java.util.Arrays;
import org.junit.Test;

public class TwoSumTest {

  @Test
  public void testTwoSum() {
    TwoSum twoSum = new TwoSum();

    int target = 9;
    int[] nums = new int[]{2, 7, 11, 15};

    assertTrue(Arrays.equals(new int[]{0, 1}, twoSum.twoSum(nums, target)));
  }

  @Test
  public void testTwoSumWithLargerArray() {
    TwoSum twoSum = new TwoSum();

    int target = 26;
    int[] nums = new int[]{2, 7, 11, 15, 19, 11};

    assertTrue(Arrays.equals(new int[]{2, 3}, twoSum.twoSum(nums, target)));
  }

  @Test
  public void testTwoSumWithNegativeValues() {
    TwoSum twoSum = new TwoSum();

    int target = 3;
    int[] nums = new int[]{2, 7, 11, 15, -5, 10, -8, 19};

    assertTrue(Arrays.equals(new int[]{2, 6}, twoSum.twoSum(nums, target)));
  }
}