package ArraysAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class Question_1_8Test {

    @Test
    public void testSetZeros_NoZero() {
        int[][] matrix = new int[][] {
            { 1, 2, 3 },
            { 4, 5, 6 },
        };
        
        int[][] expected = new int[][] {
            { 1, 2, 3 },
            { 4, 5, 6 },
        };
        Question_1_8.SetZeros(matrix);
        HelperTest.assertMatrixEquals(expected, matrix);
    }
    
    @Test
    public void testSetZeros_ZeroAtCorner() {
        int[][] matrix = new int[][] {
            { 1, 2, 0 },
            { 4, 5, 6 },
            { 7, 8, 9 },
        };
        
        int[][] expected = new int[][] {
            { 0, 0, 0 },
            { 4, 5, 0 },
            { 7, 8, 0 },
        };
        Question_1_8.SetZeros(matrix);
        HelperTest.assertMatrixEquals(expected, matrix);
    }
    
    @Test
    public void testSetZeros_ZeroAtEdge() {
        int[][] matrix = new int[][] {
            { 1, 2, 3 },
            { 4, 5, 0 },
            { 7, 8, 9 },
        };
        
        int[][] expected = new int[][] {
            { 1, 2, 0 },
            { 0, 0, 0 },
            { 7, 8, 0 },
        };
        Question_1_8.SetZeros(matrix);
        HelperTest.assertMatrixEquals(expected, matrix);
    }
    
    @Test
    public void testSetZeros_ZeroAtCenter() {
        int[][] matrix = new int[][] {
            { 1, 2, 3 },
            { 4, 0, 6 },
            { 7, 8, 9 },
        };
        
        int[][] expected = new int[][] {
            { 1, 0, 3 },
            { 0, 0, 0 },
            { 7, 0, 9 },
        };
        Question_1_8.SetZeros(matrix);
        HelperTest.assertMatrixEquals(expected, matrix);
    }
    
    @Test
    public void testSetZeros_MultipleZero() {
        int[][] matrix = new int[][] {
            { 1, 2, 3, 4, 5 },
            { 6, 0, 8, 9, 10 },
            { 11, 12, 13, 14, 15 },
            { 16, 17, 18, 0, 0 },
        };
        
        int[][] expected = new int[][] {
            { 1, 0, 3, 0, 0 },
            { 0, 0, 0, 0, 0 },
            { 11, 0, 13, 0, 0 },
            { 0, 0, 0, 0, 0 },
        };
        Question_1_8.SetZeros(matrix);
        HelperTest.assertMatrixEquals(expected, matrix);
    }
    
    @Test
    public void testSetZeros_DimensionIsZero() {
        int[][] matrix = new int[][] {
            new int[0],
            new int[0],
        };
        
        int[][] expected = new int[][] {
            new int[0],
            new int[0],
        };
        Question_1_8.SetZeros(matrix);
        HelperTest.assertMatrixEquals(expected, matrix);
        
        matrix = new int[0][];
        expected = new int[0][];
        Question_1_8.SetZeros(matrix);
        HelperTest.assertMatrixEquals(expected, matrix);
    }
    
    @Test
    public void testSetZeros_Null() {
        int[][] matrix = null;
        
        Question_1_8.SetZeros(matrix);
        assertNull(matrix);
    }
}
