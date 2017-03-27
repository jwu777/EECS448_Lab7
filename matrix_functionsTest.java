
import static org.junit.Assert.*;

import org.junit.Test;


public class matrix_functionsTest {

	@Test
	public void testGetRow() {
		// initialize new matrix
		double[][] matrix_functions = new double[3][3];
		
		// Insert values into new matrix
		matrix_functions[0][0] = 5;
		matrix_functions[0][1] = 4;
		matrix_functions[0][2] = 3;
		matrix_functions[1][0] = 6;
		matrix_functions[1][1] = 9;
		matrix_functions[1][2] = 1;
		matrix_functions[2][0] = 2;
		matrix_functions[2][1] = 5;
		matrix_functions[2][2] = 3;
		
		// Test is the row is output correctly
		assertEquals(82.0, example.matrix_functions.getRow(3), 0.001);
	}

	@Test
	public void testFindDeterminant() {
		// initialize new matrix
		double[][] matrix_functions = new double[3][3];
		
		// Insert values into new matrix
		matrix_functions[0][0] = 5;
		matrix_functions[0][1] = 4;
		matrix_functions[0][2] = 3;
		matrix_functions[1][0] = 6;
		matrix_functions[1][1] = 9;
		matrix_functions[1][2] = 1;
		matrix_functions[2][0] = 2;
		matrix_functions[2][1] = 5;
		matrix_functions[2][2] = 3;
				
		// Test if determinant is 82
		assertEquals(82.0, example.matrix_functions.determinant(3, matrix_functions), 0.001);
	}

	@Test
	public void testFindInverse() {
		// initialize new matrix
		double[][] matrix_functions = new double[3][3];
				
		// Insert values into new matrix
		matrix_functions[0][0] = 5;
		matrix_functions[0][1] = 4;
		matrix_functions[0][2] = 3;
		matrix_functions[1][0] = 6;
		matrix_functions[1][1] = 9;
		matrix_functions[1][2] = 1;
		matrix_functions[2][0] = 2;
		matrix_functions[2][1] = 5;
		matrix_functions[2][2] = 3;
		
		// Test is the row is output correctly
		assertEquals(82.0, example.matrix_functions.findInverse(3, matrix_functions), 0.001);
	}

}
