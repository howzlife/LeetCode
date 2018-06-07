package longestSubstringWithoutRepeatingChars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

  public int lengthOfLongestSubstring(String s) {

    int maxLength = 0;
    List<Character> currentSubstring = new ArrayList<>();
    Set<Character> charactersInCurrentSubString = new HashSet<>(currentSubstring);

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      currentSubstring.add(c);

      if (charactersInCurrentSubString.contains(c)) {
        removeAllCharactersInStringUpToAndIncludingChar(currentSubstring, c);
        charactersInCurrentSubString = new HashSet<>(currentSubstring);
      }
      else {
        charactersInCurrentSubString.add(c);
        if (currentSubstring.size() > maxLength) maxLength = currentSubstring.size();
      }
    }

    return maxLength;
  }

  private void removeAllCharactersInStringUpToAndIncludingChar(List<Character> list, char c) {
    while (list.get(0) != null) {
      char removed = list.remove(0);
      if (removed == c) break;
    }
  }
}
