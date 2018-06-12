package medianOfTwoSortedArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int totalLength = nums1.length + nums2.length;
    boolean isEvenTotalLength = (totalLength) % 2 == 0;

    int medianIndex = isEvenTotalLength
      ? (totalLength / 2) - 1
      : (totalLength / 2);

    List<Integer> l1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
    List<Integer> l2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

    int valueAtMedianIndex = 0;

    while (l1.size() > 0 || l2.size() > 0) {
      if (l1.size() > 0 && l2.size() > 0) {
        valueAtMedianIndex = (l1.get(0) < l2.get(0))
          ? l1.remove(0)
          : l2.remove(0);
      }

      if (l1.size() == 0) {
        valueAtMedianIndex = l2.remove(0);
      }

      if (l2.size() == 0) {
        valueAtMedianIndex = l1.remove(0);
      }
    }

    // Note: Don't forget to cast to Double
    return isEvenTotalLength
      ? getReturnValueIfEvenTotalLength(valueAtMedianIndex, l1, l2)
      : new Double(valueAtMedianIndex);
  }

  private Double getReturnValueIfEvenTotalLength(int valueAtMedian, List<Integer> l1, List<Integer> l2) {
    if (l1.size() > 0 && l2.size() > 0) {
      return new Double((double)(valueAtMedian + Math.min(l1.get(0), l2.get(0)))/ 2);
    }

    return (l1.size() > 0)
      ? new Double((double)(valueAtMedian + l1.get(0)) / 2)
      : new Double((double)(valueAtMedian + l2.get(0)) / 2);
  }
}
