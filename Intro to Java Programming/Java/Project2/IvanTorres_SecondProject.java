		/*-------------
		 * COSC 1173 Programming Lab
		 * Name: Ivan Torres
		 * Data: 2/1/2023
		 * Give area and volume given radius and length
		 ----------* */

//Importing Scanner and Math functions
import java.util.Scanner;
import java.lang.Math;

public class IvanTorres_SecondProject {

	public static void main(String[] args) {
//Creating new scanner to be used later
		Scanner input = new Scanner(System.in);

//Calling user to input radius and length using Scanner
		System.out.print("Enter the radius and length of the cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();

//Using input radius and length to compute the area and length
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
//Showing user the results
		System.out.println("The area is $" + area +
				" and volume is $" + volume);
	}
}
