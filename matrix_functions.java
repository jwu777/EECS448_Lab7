
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
	public double findDeterminant()
	{
		double determinantVal = 0.0;
		
		// Base case for 1x1 matrix
		if (size == 1)
		{
			determinantVal = matrixA[0][0];
		}
		else if(size == 2) // Base case for 2x2 matrix
		{
			determinantVal = matrixA[0][0] * matrixA[1][1] - matrixA[0][1] * matrixA[1][0];
		}
		else
		{
			for(int i = 0; i < size; i++)
			{
				determinantVal += Math.pow(-1.0, (double)i) * matrixA[0][i] * subMatrix(0, i).findDeterminant();
			}
		}
		
		return determinantVal;
	}
	
	public matrix_functions findInverse()
	{
		matrix_functions matrixInverted = new matrix_functions(this.size);
		
		double determinantVar = findDeterminant();
		
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				matrixInverted.matrixA[i][j] = (Math.pow(-1.0, (double)(i + j)) * subMatrix(j, i).findDeterminant() / determinantVar);
			}
		}
		
		return matrixInverted;
	}
	
}
