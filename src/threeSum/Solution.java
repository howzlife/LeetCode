package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

  public List<List<Integer>> threeSum(int[] nums) {

    Arrays.sort(nums);
    List<List<Integer>> triplets = new ArrayList<>();

    for (int i = 0; i < nums.length - 2; i++) {
      findUniqueTripletsOfSum(0 - nums[i], i + 1, nums, triplets);
      while (nums[i] == nums[i + 1] && i < nums.length - 2) i++;
    }

    return triplets;
  }

  private void findUniqueTripletsOfSum(int sumToFind, int startIndex, int[] nums, List<List<Integer>> solutions) {
    int minIndex = startIndex, maxIndex = nums.length - 1;

    while (minIndex < maxIndex) {
      if (nums[minIndex] + nums[maxIndex] == sumToFind) {
        solutions.add(getNewSolution(nums[minIndex], nums[maxIndex], 0 - sumToFind));
        minIndex++;
        maxIndex--;

        while (minIndex < maxIndex && nums[minIndex] == nums[minIndex - 1]) {
          minIndex++;
        }

        while (maxIndex > minIndex && maxIndex != nums.length - 1 && nums[maxIndex] == nums[maxIndex + 1]) {
          maxIndex--;
        }
      }
      if (nums[minIndex] + nums[maxIndex] < sumToFind) minIndex++;
      if (nums[minIndex] + nums[maxIndex] > sumToFind) maxIndex--;
    }
  }

  private List<Integer> getNewSolution(int first, int second, int third) {
    List<Integer> newSolution = new ArrayList<>();
    newSolution.add(first);
    newSolution.add(second);
    newSolution.add(third);

    return newSolution;
  }
}

