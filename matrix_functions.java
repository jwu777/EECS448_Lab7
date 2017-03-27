
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
	
	// Makes a smaller matrix - smaller by 1 unit
	private matrix_functions subMatrix(int r, int c)
	{
		matrix_functions subMatrixA = new matrix_functions(size - 1);
		
		int row = 0;
		for(int i = 0; i < size; i++)
		{
			if(i == r) continue;
			
			int col = 0;
			for(int j = 0; j < size; j++)
			{
				if(j == c) continue;
				
				subMatrixA.matrixA[row][col] = matrixA[i][j];
				col++;
			}
			
			row++;
		}
		
		return subMatrixA;
	}
	
	
  /**
	Getter and setter methods
  **/

	// Sets matrix row
	public void setRow(int row, String row_vals) //accepts a row number followed by an array of values
	{
		matrixA[row] = stringToDoubleArray(row_vals);
	}
	
	// Gets matrix row
	public String getRow(int row)
	{	
		return doubleToStringArray(matrixA[row]);
	}	

/**
 	Matrix public methods
**/
	
}
