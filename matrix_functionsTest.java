import static org.junit.Assert.*;

import org.junit.Test;


public class matrix_functionsTest {

	@Test
	public void testGetRow() {
		// initialize new matrix
		matrix_functions matrixTest = new matrix_functions(3);
		
		// Insert values into new matrix
		matrixTest.matrixA[0][0] = 5.0;
		matrixTest.matrixA[0][1] = 4.0;
		matrixTest.matrixA[0][2] = 3.0;
		matrixTest.matrixA[1][0] = 6.0;
		matrixTest.matrixA[1][1] = 9.0;
		matrixTest.matrixA[1][2] = 1.0;
		matrixTest.matrixA[2][0] = 2.0;
		matrixTest.matrixA[2][1] = 5.0;
		matrixTest.matrixA[2][2] = 3.0;
		
		// Test is the row is output correctly
		assertTrue(matrixTest.getRow(0).equals("5.0 4.0 3.0"));
	}

	@Test
	public void testFindDeterminant() {
		// initialize new matrix
		matrix_functions matrixTest = new matrix_functions(3);
		
		// Insert values into new matrix
		matrixTest.matrixA[0][0] = 5.0;
		matrixTest.matrixA[0][1] = 4.0;
		matrixTest.matrixA[0][2] = 3.0;
		matrixTest.matrixA[1][0] = 6.0;
		matrixTest.matrixA[1][1] = 9.0;
		matrixTest.matrixA[1][2] = 1.0;
		matrixTest.matrixA[2][0] = 2.0;
		matrixTest.matrixA[2][1] = 5.0;
		matrixTest.matrixA[2][2] = 3.0;
				
		// Test if determinant is 82
		assertEquals(82.0, matrixTest.findDeterminant(), 0.1);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testFindInverse() {
		// initialize new matrix
		matrix_functions matrixTest = new matrix_functions(3);
				
		// Insert values into new matrix
		matrixTest.matrixA[0][0] = 2.0;
		matrixTest.matrixA[0][1] = 1.0;
		matrixTest.matrixA[0][2] = 1.0;
		matrixTest.matrixA[1][0] = -5.0;
		matrixTest.matrixA[1][1] = -3.0;
		matrixTest.matrixA[1][2] = 0.0;
		matrixTest.matrixA[2][0] = 1.0;
		matrixTest.matrixA[2][1] = 1.0;
		matrixTest.matrixA[2][2] = -1.0;
		
		// initialize new matrix
		matrix_functions matrixTestB = new matrix_functions(3);
		
		// Insert values into new matrix
		matrixTestB.matrixA[0][0] = -3.0;
		matrixTestB.matrixA[0][1] = -2.0;
		matrixTestB.matrixA[0][2] = -3.0;
		matrixTestB.matrixA[1][0] = 5.0;
		matrixTestB.matrixA[1][1] = 3.0;
		matrixTestB.matrixA[1][2] = 5.0;
		matrixTestB.matrixA[2][0] = 2.0;
		matrixTestB.matrixA[2][1] = 1.0;
		matrixTestB.matrixA[2][2] = 1.0;
		
		// Test is the row is output correctly
		assertEquals(matrixTestB.matrixA, matrixTest.findInverse().matrixA);
	}

}
