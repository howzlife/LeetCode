package longestSubstringWithoutRepeatingChars;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void firstTest() {
    String first = "abcabcbb";
    String second = "bbbbbbb";
    String third = "pwwkew";

    Solution solution = new Solution();

    int[] expected = new int[]{3, 1, 3};
    int[] actual = new int[]{
      solution.lengthOfLongestSubstring(first),
      solution.lengthOfLongestSubstring(second),
      solution.lengthOfLongestSubstring(third)
    };

    System.out.println("Answer: " + Arrays.toString(actual));
    assertTrue(Arrays.equals(expected, actual));
  }
}
