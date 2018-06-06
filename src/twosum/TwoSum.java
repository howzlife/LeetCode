package twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public int[] twoSum(int[] nums,int target) {

    Map<Integer, Integer> previousValues = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int currentValue = nums[i];
      int wantedValue = target - currentValue;

      if (previousValues.containsKey(wantedValue)) return new int[]{previousValues.get(wantedValue), i};
      previousValues.put(currentValue, i);
    }

    return new int[]{};
  }
}
