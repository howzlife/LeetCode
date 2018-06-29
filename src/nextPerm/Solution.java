package nextPerm;

import java.util.Arrays;

public class Solution {

  public void nextPermutation(int[] nums) {
    if (nums.length == 1 || nums.length == 0) return;

    boolean found = false;

    int i = nums.length - 1;
    for (; i > 0; i--) {
      if (nums[i - 1] < nums[i]) {
        found = true;
        i--;
        break;
      }
    }

    System.out.println("I: " + i);

    if (found) {
      int min = Integer.MAX_VALUE;
      int minIndex = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] > nums[i] && nums[j] < min) {
          min = nums[j];
          minIndex = j;
        }
      }

      System.out.println("Min: " + min);
      System.out.println("MinIndex: " + minIndex);
      System.out.println(Arrays.toString(nums));
      int temp = nums[i];
      nums[i] = nums[minIndex];
      nums[minIndex] = temp;
      System.out.println(Arrays.toString(nums));
      Arrays.sort(nums, i + 1, nums.length);
    } else {
      Arrays.sort(nums);
    }
  }
}
