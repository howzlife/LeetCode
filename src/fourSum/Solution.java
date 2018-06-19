package fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> solution = new ArrayList<>();

    for (int i = 0; i < nums.length - 3; i++) {
      findThreeSumSolutionForTarget(target - nums[i], nums[i], i + 1, nums, solution);
      while(i < nums.length - 3 && nums[i] == nums[i+1]) i++;
    }

    return solution;
  }

  private void findThreeSumSolutionForTarget(int target, int firstValue, int startIndex, int[] nums, List<List<Integer>> solution) {
    for (int i = startIndex; i < nums.length - 2; i++) {
      findTwoSumSolutionForTarget(target - nums[i], firstValue, nums[i], i + 1, nums, solution);
      while(i < nums.length - 2 && nums[i] == nums[i+1]) i++;
    }
  }

  private void findTwoSumSolutionForTarget(int target, int firstValue, int secondValue, int startIndex, int[] nums, List<List<Integer>> solution) {
    int minIndex = startIndex, maxIndex = nums.length - 1;

    while (minIndex < maxIndex) {
      if (nums[minIndex] + nums[maxIndex] == target) {
        solution.add(getNewSolution(firstValue, secondValue, nums[minIndex], nums[maxIndex]));
        minIndex++;
        maxIndex--;

        while (minIndex < maxIndex && nums[minIndex] == nums[minIndex - 1]) minIndex++;
        while (maxIndex > minIndex && maxIndex != nums.length - 1 && nums[maxIndex] == nums[maxIndex + 1]) maxIndex--;
      }
      if (nums[minIndex] + nums[maxIndex] < target) minIndex++;
      if (nums[minIndex] + nums[maxIndex] > target) maxIndex--;
    }
  }

  private List<Integer> getNewSolution(int first, int second, int third, int fourth) {
    List<Integer> newSolution = new ArrayList<>();
    newSolution.add(first);
    newSolution.add(second);
    newSolution.add(third);
    newSolution.add(fourth);

    return newSolution;
  }
}
