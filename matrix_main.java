
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class matrix_main
{
	
	public static void main(String[] args) throws IOException
	{
		// Confirm command-line parameters
		if(args.length < 2)
		{
			System.out.println("Error - Expected usage: ./main input.txt output.txt");
			return;
		}
		
		// Initialize file streams
		BufferedReader inputFile = null;
		BufferedWriter outputFile = null;
		
		try {
			inputFile = new BufferedReader(new FileReader(args[0]));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			outputFile = new BufferedWriter(new FileWriter(args[1]));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Process commands
		int n;
			
		try {
			while((n = Integer.parseInt(inputFile.readLine())) != 0)
			{
				
				matrix_functions matrixA = new matrix_functions(n);
				String currentRow = new String();
				
				//Read in matrix values and print to file
				outputFile.write("M =");
				outputFile.newLine();
				
				for(int i = 0; i < n; i++)
				{
					currentRow	 = inputFile.readLine();
					matrixA.setRow(i, currentRow);
					
					outputFile.write(currentRow);
					outputFile.newLine();
				}
				
				// Calculate determinant and print to file
				double det = matrixA.findDeterminant();
				
				outputFile.write("det(M) = " + det);
				outputFile.newLine();
				
				// Find inverse of matrix, print to file if the inverse matrix exists
				if (det != 0)
				{
					matrix_functions matrixB = matrixA.findInverse();
					
					outputFile.write("M inverse =");
					outputFile.newLine();
					
					for(int i = 0; i < n; i++)
					{
						outputFile.write(matrixB.getRow(i));
						outputFile.newLine();
					}
					
				}
				
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		inputFile.close();
		outputFile.close();
		
		return;
	}

}
