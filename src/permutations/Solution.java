package permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> lists = new ArrayList<>();
    Arrays.sort(nums);

    getPermutations(lists, new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet())), new ArrayList<>());

    return lists;
  }

  private void getPermutations(List<List<Integer>> lists, Set<Integer> nums, ArrayList<Integer> previous) {

    if (nums.size() == 0) {
      lists.add(previous);
      return;
    }

    for (Integer i : nums) {
      Set<Integer> clone = new HashSet<>(nums);
      clone.remove(i);

      ArrayList<Integer> next = new ArrayList<>(previous);
      next.add(i);

      getPermutations(lists, clone, next);
    }
  }
}