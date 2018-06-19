package containerWithMostWater;

class Solution {
  public int maxArea(int[] height) {
    int leftIndex = 0, rightIndex = height.length - 1;
    int lastLeftHeight = height[leftIndex], lastRightHeight = height[rightIndex];
    int maxArea = 0;

    while (leftIndex < rightIndex) {
      lastLeftHeight = height[leftIndex];
      lastRightHeight = height[rightIndex];
      maxArea = Math.max(maxArea, Math.min(lastLeftHeight, lastRightHeight) * (rightIndex - leftIndex));

      if (lastLeftHeight < lastRightHeight) leftIndex++;
      else rightIndex--;
    }

    return maxArea;
  }
}