
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
	
	/**
  	Helper Methods
	**/
	
	// Convert double array to String array
	private String doubleToStringArray(double[] arr)
	{
		String temp = new String();
		
		for(int i = 0; i < arr.length; i ++)
		{
			temp += arr[i];
			if(i < arr.length -1)
			{
				temp += " ";	
			}
		}
		
		return temp;
	}	
}
