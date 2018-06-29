package generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public List<String> generateParenthesis(int n) {

    if (n == 0) return new ArrayList<>();

    StringBuilder base = new StringBuilder("(");
    List<String> permutations = new ArrayList<>();

    if (n >= 2 && isValid(base.toString(), '(')) {
      generatePermutations(base.toString(), '(', permutations, n - 2, n);
    }

    if (n >= 1 && isValid(base.toString(), ')')) {
      generatePermutations(base.toString(), ')', permutations, n - 1, n - 1);
    }

    return permutations;
  }

  private boolean isValid(String base, char bracket) {
    StringBuilder sb = new StringBuilder(base);
    sb.append(bracket);

    String s = sb.toString();
    int open = 0, closed = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') open++;
      else closed++;

      if (closed > open) return false;
    }

    return true;
  }

  private void generatePermutations(String base, char bracket, List<String> permutations, int open, int closed) {
    StringBuilder sb = new StringBuilder(base);
    sb.append(bracket);
    if (open == 0 && closed == 0) {
      permutations.add(sb.toString());
    } else {
      if (open > 0 && isValid(sb.toString(), '(')) generatePermutations(sb.toString(), '(', permutations, open - 1, closed);
      if (closed > 0 && isValid(sb.toString(), ')')) generatePermutations(sb.toString(), ')', permutations, open, closed - 1);
    }
  }
}
