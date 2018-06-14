package romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  Map<String, Integer> twoDigitRomanNumeralsToInt = new HashMap<>();
  Map<String, Integer> oneDigitRomanNumeralsToInt = new HashMap<>();

  public int romanToInt(String s) {
    oneDigitRomanNumeralsToInt.put("M", 1000);
    oneDigitRomanNumeralsToInt.put("D", 500);
    oneDigitRomanNumeralsToInt.put("C", 100);
    oneDigitRomanNumeralsToInt.put("L", 50);
    oneDigitRomanNumeralsToInt.put("X", 10);
    oneDigitRomanNumeralsToInt.put("V", 5);
    oneDigitRomanNumeralsToInt.put("I", 1);

    twoDigitRomanNumeralsToInt.put("CM", 900);
    twoDigitRomanNumeralsToInt.put("CD", 400);
    twoDigitRomanNumeralsToInt.put("XC", 90);
    twoDigitRomanNumeralsToInt.put("XL", 40);
    twoDigitRomanNumeralsToInt.put("IX", 9);
    twoDigitRomanNumeralsToInt.put("IV", 4);

    int solution = 0;
    for (int i = 0; i < s.length(); i++) {

      solution += (isTwoDigitNumeral(s, i, i+1))
        ? twoDigitRomanNumeralsToInt.get((new StringBuilder()).append(s.charAt(i)).append(s.charAt(i+1)).toString())
        : oneDigitRomanNumeralsToInt.get(Character.toString(s.charAt(i)));

      if (isTwoDigitNumeral(s, i, i+1)) {
        i++;
      }
    }

    return solution;
  }

  private boolean isTwoDigitNumeral(String s, int i, int j) {
    // make sure it's not the last digit
    if (j >= s.length()) {
      return false;
    }

    StringBuilder sb = (new StringBuilder()).append(s.charAt(i)).append(s.charAt(j));
    return twoDigitRomanNumeralsToInt.containsKey(sb.toString());
  }
}
