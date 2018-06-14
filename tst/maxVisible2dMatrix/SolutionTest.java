package maxVisible2dMatrix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void testFirstMatrix() {
    char[][] matrix = new char[7][7];
    matrix[0] = new char[]{'*', ' ', ' ', '*', 'W', ' ', '*'};
    matrix[1] = new char[]{' ', 'W', ' ', ' ', '*', ' ', ' '};
    matrix[2] = new char[]{'*', 'W', ' ', '*', 'W', ' ', '*'};
    matrix[3] = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' '};
    matrix[4] = new char[]{' ', '*', 'W', '*', ' ', '*', ' '};
    matrix[5] = new char[]{'*', 'W', ' ', '*', 'W', ' ', ' '};
    matrix[6] = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' '};

    int expected = 5;
    int actual = solution.FindMaxVisibleFromAnyPoint(matrix);

    assertEquals(expected, actual);
  }

  @Test
  public void testSecondMatrix() {
    char[][] matrix = new char[7][7];
    matrix[0] = new char[]{'*', ' ', ' ', '*', 'W', ' ', '*'};
    matrix[1] = new char[]{'W', 'W', ' ', ' ', '*', ' ', ' '};
    matrix[2] = new char[]{'*', 'W', ' ', '*', 'W', ' ', '*'};
    matrix[3] = new char[]{'*', ' ', ' ', 'W', ' ', ' ', ' '};
    matrix[4] = new char[]{' ', ' ', ' ', '*', ' ', '*', ' '};
    matrix[5] = new char[]{'*', 'W', ' ', '*', 'W', ' ', ' '};
    matrix[6] = new char[]{'*', ' ', ' ', ' ', ' ', ' ', ' '};

    int expected = 6;
    int actual = solution.FindMaxVisibleFromAnyPoint(matrix);

    assertEquals(expected, actual);
  }

  @Test
  public void testThirdMatrix() {
    char[][] matrix = new char[7][7];
    matrix[0] = new char[]{'*', 'W', '*', '*', 'W', ' ', '*'};
    matrix[1] = new char[]{'W', 'W', '*', ' ', '*', ' ', ' '};
    matrix[2] = new char[]{'*', 'W', '*', '*', 'W', ' ', '*'};
    matrix[3] = new char[]{'*', ' ', '*', 'W', ' ', ' ', ' '};
    matrix[4] = new char[]{' ', ' ', '*', '*', '*', '*', ' '};
    matrix[5] = new char[]{'*', 'W', '*', '*', 'W', ' ', ' '};
    matrix[6] = new char[]{'*', ' ', '*', ' ', ' ', ' ', ' '};

    int expected = 10;
    int actual = solution.FindMaxVisibleFromAnyPoint(matrix);

    assertEquals(expected, actual);
  }

  @Test
  public void testFourthMatrix() {
    char[][] matrix = new char[7][7];
    matrix[0] = new char[]{'*'};

    int expected = 1;
    int actual = solution.FindMaxVisibleFromAnyPoint(matrix);

    assertEquals(expected, actual);
  }
}
