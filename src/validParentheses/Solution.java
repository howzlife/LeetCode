package validParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Solution {

  private Map<Character, Character> openValues = new HashMap<>();

  public boolean isValid(String s) {
    if (s.length() == 0 && s == null) return true;

    openValues.put('(', ')');
    openValues.put('[', ']');
    openValues.put('{', '}');

    Stack<Character> openBrackets = new Stack<>();
    Set<Character> open = openValues.keySet();

    for (int i = 0; i < s.length(); i++) {
      Character current = s.charAt(i);

      if (open.contains(s.charAt(i))) {
        openBrackets.push(s.charAt(i));
      } else {
        if (openBrackets.empty()) return false;
        Character comparator = openBrackets.pop();

        if (current != openValues.get(comparator)) {
          return false;
        }
      }
    }

    return openBrackets.size() == 0;
  }
}
