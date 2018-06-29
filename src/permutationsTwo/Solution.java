package permutationsTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> lists = new ArrayList<>();
    Arrays.sort(nums);

    getPermutations(lists, new ArrayList<>(Arrays.stream(nums).boxed().collect(Collectors.toList())), new ArrayList<>());

    return lists;
  }

  private void getPermutations(List<List<Integer>> lists, ArrayList<Integer> nums, ArrayList<Integer> previous) {

    if (nums.size() == 0) {
      lists.add(previous);
      return;
    }

    for (int i = 0; i < nums.size(); i++) {
      ArrayList<Integer> clone = new ArrayList<>(nums);
      clone.remove(i);

      ArrayList<Integer> next = new ArrayList<>(previous);
      next.add(nums.get(i));

      getPermutations(lists, clone, next);
      while (i < nums.size() - 1 && nums.get(i) == nums.get(i + 1)) i++;
    }
  }
}