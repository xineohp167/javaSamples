/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsubmatrix;

import java.util.LinkedList;
import java.util.Stack;

final class Cell {

    final int col;
    final int row;

    Cell(final int col, final int row) {
        this.col = col;
        this.row = row;
    }

    @Override
    public String toString() {
        return String.format("[col=%d, row=%d]", col, row);
    }
}

final class Cache {

    private final LinkedList<Integer> aggregateHeights;

    Cache(final int size) {
        aggregateHeights = new LinkedList<>();
        for (int i = 0; i <= size; i++) {
            aggregateHeights.add(0);
        }
    }

    public int get(final int col) {
        return aggregateHeights.get(col);
    }

    public void aggregate(final int[] row) {
        for (int col = 0; col < row.length; col++) {
            if (row[col] == 0) {
                aggregateHeights.set(col, 0);
            } else {
                aggregateHeights.set(col, aggregateHeights.get(col) + 1);
            }
        }
    }
}

/**
 * Finds the max submatrix from a matrix
 *
 * @author Fabien
 */
public class MaxSubMatrix {

    // Instance variables
    private int[][] matrix;

    // Constructor
    public MaxSubMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Returns in string format the upper left corner, the lower right corner
     * and the number of the elements. The string format should be:<br>
     * "upper left : x0, y0<br>
     * lower right : x1, y1<br>
     * total elements : n"<br>
     *
     * @param matrix the matrix
     * @return the string output
     */
    public String printMaximalRectangle(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Matrix null or length  = 0");
        }

        int bestArea = 0;
        Cell bestUpperLeftCorner = new Cell(0, 0);
        Cell bestLowerRightCorner = new Cell(-1, -1);

        final int numRows = matrix.length;
        final int numColumns = matrix[0].length;
        

        final Stack<Cell> stack = new Stack<>();
        final Cache rectangleHeightCache = new Cache(numColumns);

        for (int row = 0; row < numRows; row++) {
            rectangleHeightCache.aggregate(matrix[row]);
            for (int col = 0, currentRectHeight = 0; col <= numColumns; col++) {
                final int aggregateRectHeight = rectangleHeightCache.get(col);

                if (aggregateRectHeight > currentRectHeight) {
                    stack.push(new Cell(col, currentRectHeight));
                    currentRectHeight = aggregateRectHeight;
                } else if (aggregateRectHeight < currentRectHeight) {

                    Cell rectStartCell;
                    do {
                        rectStartCell = stack.pop();
                        final int rectWidth = col - rectStartCell.col;
                        final int area = currentRectHeight * rectWidth;
                        if (area > bestArea) {
                            bestArea = area;
                            bestLowerRightCorner = new Cell(col - 1, row);
                             bestUpperLeftCorner= new Cell(rectStartCell.col, row - currentRectHeight + 1);
                            //bestLowerLeftCorner = new Cell(rectStartCell.col, row);
                            //bestUpperRightCorner = new Cell(col - 1, row - currentRectHeight + 1);
                        }
                        currentRectHeight = rectStartCell.row;
                    } while (aggregateRectHeight < currentRectHeight);

                    currentRectHeight = aggregateRectHeight;
                    if (currentRectHeight != 0) {
                        stack.push(rectStartCell);
                    }
                }
            }
        }

        
        String result = "";
        result += "upper left: " + bestUpperLeftCorner + "\n";
        result += "lower right: " + bestLowerRightCorner + "\n";
        result += "total elements: " + bestArea + "\n";
        return result;
    }

}
