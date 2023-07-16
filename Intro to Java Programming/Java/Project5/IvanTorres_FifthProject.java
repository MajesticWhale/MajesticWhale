		/*-------------
		 * COSC 1173 Programming Lab
		 * Name: Ivan Torres
		 * Data: 2/15/2023
		 * Displays the area of a hexagon once length of a side is input
		 ----------* */

//Importing Math & Scanner
import java.lang.Math;
import java.util.Scanner;

public class IvanTorres_FifthProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Ask user to enter the size of side of the hexagon
		System.out.print("Enter the side length: ");
		double side = input.nextDouble();

		// Compute the area of the hexagon
		double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);

		// Display result
		System.out.printf("The Area of the Hexagon is: %.2f ", area); 
	}
}