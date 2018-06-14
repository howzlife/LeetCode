package longestCommonPrefix;

import java.util.Arrays;

public class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    if (strs.length == 1) return strs[0];
    Arrays.sort(strs);

    return longestPrefixBetweenStrings(strs[0], strs[strs.length - 1]);
  }

  private String longestPrefixBetweenStrings(String first, String second) {
    System.out.println("First: " + first);
    System.out.println("Second: " + second);

    for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
      if (first.charAt(i) != second.charAt(i)) {
        return first.substring(0, i);
      }
      if (i == Math.min(first.length(), second.length()) - 1) {
        return first.substring(0, Math.min(first.length(), second.length()));
      }
    }

    return "";
  }
}
