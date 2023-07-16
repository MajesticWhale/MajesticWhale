	/* **********************************
	 * COSC 1173 Programming Lab
	 * Name: Ivan Torres
	 * Data: 3/14/2023
	 * Show the sum of each individual row and column separately of an input 3 by 4 matrix
	********************************** */
import java.util.Scanner;

public class IvanTorres_TenthProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//create double for array and the column and row Indexs
		double[][] m = new double [3][4];

		//have user input the original array
		System.out.print("Enter a 3 by 4 matrix row by row: ");
		for (int i=0; i<m.length;i++) {
			for (int j=0; j<m[i].length;j++)
			m[i][j] = input.nextDouble();
		}

		//print while calling methods to make the sum of the columns
		for (int columnIndex=0; columnIndex<m[0].length;columnIndex++)
			System.out.println("Sum of the elements at column " + columnIndex + " is " + sumColumn(m, columnIndex));
		
		//print while calling methods to make the sum of the rows
		for (int rowIndex=0; rowIndex<m.length;rowIndex++)
			System.out.println("Sum of the elements at Row " + rowIndex + " is " + sumRow(m, rowIndex));
	}
		
			
// Method establishes how many numbers are above or equal to the average
	public static double sumColumn (double[][] m, int columnIndex) {
		double total = 0;
		for (int i=0;i<m.length;i++) {
			total += m[i][columnIndex];
		}
		return total;
	}

// Method establishes how many numbers are above or equal to the average
	public static double sumRow (double[][] m, int rowIndex) {
		double total = 0;
		for (int i=0;i<m[rowIndex].length;i++) {
			total += m[rowIndex][i];
		}
		return total;
	}
}