
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
	Helper methods
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
	
	// Convert String array to double array
	private double[] stringToDoubleArray(String str)
	{
		double[] arr = new double[size];
		
		// Parse String into integers
		String[] bits = str.split(" ");
		
		int i = 0;
		
		for(String bit : bits)
		{
			arr[i++] = Double.parseDouble(bit);
		}
		
		return arr;
	}
}
