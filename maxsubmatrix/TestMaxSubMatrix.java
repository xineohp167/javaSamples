/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsubmatrix;

/**
 *
 * @author Fabien
 */
public class TestMaxSubMatrix {
    
    public static void main(String[] args) {
        int[][] matrix = {{ 0, 1, 0, 0, 1, 1, 0 }, 
                          { 1, 0, 1, 1, 1, 0, 1 },
                          { 0, 1, 0, 1, 1, 0, 1 }, 
                          { 1, 1, 0, 1, 1, 0, 1 }, 
                          { 1, 0, 1, 1, 1, 0, 1},
                          { 1, 1, 1, 0, 1, 1, 0 } };
        
        MaxSubMatrix maxSubMatrix = new MaxSubMatrix(matrix);
        System.out.println(maxSubMatrix.printMaximalRectangle(matrix));
    }
    
    
}
