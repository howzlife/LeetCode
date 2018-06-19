package cherryPickup;

import java.util.LinkedList;

public class Solution {

  public int cherryPickup(int[][] grid) {

    LinkedList<Coordinate> coordinatesToVisit = new LinkedList<>();

    if (grid[0][0] == (-1)) {
      return 0;
    }

    boolean solvable = false;
    coordinatesToVisit.add(new Coordinate(0, 0));
    int cherryCount = 0;

    int row = 0, column = 0;
    if (grid[row][column] == 1) cherryCount++;
    grid[row][column] = (-1);

    while (!coordinatesToVisit.isEmpty()) {
      Coordinate current = coordinatesToVisit.remove(0);
      row = current.row;
      column = current.column;


      if (row == grid.length -1 && column == grid[0].length - 1) solvable = true;

      if (row > 0 && grid[row - 1][column] != -1) {
        coordinatesToVisit.add(new Coordinate(row - 1, column));

        if (grid[row - 1][column] == 1) cherryCount++;
        grid[row - 1][column] = (-1);
      }

      if (row < grid.length - 1 && grid[row +1][column] != -1) {
        coordinatesToVisit.add(new Coordinate(row + 1, column));

        if (grid[row + 1][column] == 1) cherryCount++;
        grid[row + 1][column] = (-1);
      }

      if (column > 0 && grid[row][column - 1] != -1) {
        coordinatesToVisit.add(new Coordinate(row, column - 1));

        if (grid[row][column - 1] == 1) cherryCount++;
        grid[row][column - 1] = (-1);
      }

      if (column < grid[0].length - 1 && grid[row][column + 1] != -1) {
        coordinatesToVisit.add(new Coordinate(row, column + 1));

        if (grid[row][column + 1] == 1) cherryCount++;
        grid[row][column + 1] = (-1);
      }

      if (grid[row][column] == 1) cherryCount++;
      grid[row][column] = (-1);
    }

    return solvable ? cherryCount : 0;
  }
}
