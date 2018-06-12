package zigzagConversion;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public String convert(String s, int numRows) {
    if (numRows == 1) return s;

    List<List> rows = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      rows.add(new ArrayList<Character>());
    }

    boolean goingDown = true;
    int listNumber = 0;

//    Populate our lists of characters
    for (int i = 0; i < s.length(); i++) {
      rows.get(listNumber).add(s.charAt(i));
      if (goingDown) {
        if (++listNumber == numRows) {
          listNumber -= 2;
          goingDown = false;
        }
      } else {
        if (--listNumber == -1) {
          listNumber += 2;
          goingDown = true;
        }
      }
    }

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < numRows; i++) {
      System.out.println(rows.get(i).toString());
      while (!rows.get(i).isEmpty()) {
        result.append(rows.get(i).remove(0));
      }
    }

    return result.toString();
  }
}
