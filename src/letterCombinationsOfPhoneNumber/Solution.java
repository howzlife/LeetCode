package letterCombinationsOfPhoneNumber;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> letterCombinations(String digits) {
    String[] digitLetters = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    List<String> results = new ArrayList<>();
    if (digits.length() == 0) return results;

    results.add("");
    for (int i = 0; i < digits.length(); i++) {
      String nextValues = digitLetters[Integer.parseInt(Character.toString(digits.charAt(i)))];
      List<String> newResults = new ArrayList<>();
      for (int j = 0; j < nextValues.length(); j++) {
        for (int k = 0; k < results.size(); k++) {
          newResults.add(results.get(k) + nextValues.charAt(j));
        }
      }
      results = newResults;
    }

    return results;

  }
}
