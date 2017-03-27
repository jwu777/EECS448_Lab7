
// Matrix functions

public class matrix_functions
{
  /**
	Variables
  **/
	int size = 0;
  
	double[][] matrixA;
  
  /**
	Constructor method
  **/
	
	// Constructor method
	// Accepts a square matrix of size n
	public matrix_functions(int n)
	{
		size = n;
		
		matrixA = new double[size][size];
	}
}
