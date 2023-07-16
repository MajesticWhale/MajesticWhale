		/*-------------
		 * COSC 1173 Programming Lab
		 * Name: Ivan Torres
		 * Data: 2/8/2023
		 * Give shipping cost and total cost given weight of package and price of product
		 ----------* */

//Importing Scanner and Math functions
import java.util.Scanner;
import java.lang.Math;

public class IvanTorres_ThirdProject {

	public static void main(String[] args) {
//Creating new scanner to be used later
		Scanner input = new Scanner(System.in);

//Calling user to input weight and price of product and establish totalPrice as a double
		System.out.print("Enter the weight of the package and the price of the product: ");
		double weight = input.nextDouble();
		double basePrice = input.nextDouble();
		double totalPrice;

//Using input weight to find price of shipping then display message accordingly
		if (basePrice < 0) {
			System.out.println("The weight/price cannot be negative");
		}
		else {
		if (weight < 0){
			System.out.println("The weight/price cannot be negative");
		}
		else if (weight <= 1){
			totalPrice = basePrice + 3.5;
			System.out.println("The shipping cost is $3.5 dollars and the total amount due is $" + totalPrice);
		}
		else if (weight <= 3){
			totalPrice = basePrice + 5.5;
			System.out.println("The shipping cost is $5.5 dollars and the total amount due is $" + totalPrice);
		}
		else if (weight <= 10){
			totalPrice = basePrice + 8.5;
			System.out.println("The shipping cost is $8.5 dollars and the total amount due is $" + totalPrice);
		}
		else if (weight <= 20){
			totalPrice = basePrice + 10.5;
			System.out.println("The shipping cost is $10.5 dollars and the total amount due is $" + totalPrice);
		}
		else if (weight > 20){
			System.out.println("The weight cannot exceed 20lbs");
		}
		}
	}
}
