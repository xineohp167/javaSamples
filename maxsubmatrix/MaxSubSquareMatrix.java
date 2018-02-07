/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsubmatrix;

import java.util.Arrays;

public class MaxSubSquareMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 0, 1},
        {1, 1, 0, 1, 0},
        {0, 1, 1, 1, 0},
        {1, 1, 1, 1, 0},
        {1, 1, 1, 1, 1},
        {0, 0, 0, 0, 0}};

        printMaxSubSquare(matrix);

    }

    private static void printMaxSubSquare(int[][] matrix) {
        int[][] subMatrix = new int[matrix.length][matrix[0].length];
        int maxS;
        int maxI;
        int maxJ;

        for (int i = 0; i < subMatrix.length; i++) {
            subMatrix[i][0] = matrix[i][0];
        }
		// System.out.println(Arrays.deepToString(subMatrix));

        for (int j = 0; j < subMatrix[0].length; j++) {
            subMatrix[0][j] = matrix[0][j];
        }
        //System.out.println(Arrays.deepToString(subMatrix));

        for (int i = 1; i < subMatrix.length; i++) {
            for (int j = 1; j < subMatrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    subMatrix[i][j] = min(subMatrix[i][j - 1], subMatrix[i - 1][j], subMatrix[i - 1][j - 1]) + 1;
                } else {
                    subMatrix[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(subMatrix));

        maxS = subMatrix[0][0];
        maxI = 0;
        maxJ = 0;
        for (int i = 0; i < subMatrix.length; i++) {
            for (int j = 0; j < subMatrix[0].length; j++) {
                if (maxS < subMatrix[i][j]) {
                    maxS = subMatrix[i][j];
                    maxI = i;
                    maxJ = j;
                }

            }
        }
        System.out.println("i: " + maxI + " j: " + maxJ + " s: " + maxS);
        System.out.printf("\nMaximum size sub-matrix is: \n");
        for (int i = maxI; i > maxI - maxS; i--) {
            for (int j = maxJ; j > maxJ - maxS; j--) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.printf("\n");
        }
    }

    private static int min(int a, int b, int c) {
        // TODO Auto-generated method stub
        int m = a;
        if (m > b) {
            m = b;
        }
        if (m > c) {
            m = c;
        }
        return m;
    }

}
