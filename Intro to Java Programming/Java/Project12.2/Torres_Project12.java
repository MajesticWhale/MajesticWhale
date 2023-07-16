	/* **********************************
	 * Objective: Take two integers and returns their sum.  Ask for the user to re-input if they put in something wrong the first time.
	 * Algorithm: Create multiple objects, check if they are correctly input and prompt again if not, then give the sum
	 * Input and Output: Input is two whole numbers, output is their sum
	 * Created by: Ivan B Torres
	 * Date: 6/18/2023
	 * Version: 1.0
	********************************** */
import java.util.Scanner;

public class Torres_Project12 {
	public static void main(String[] args) {
		/* Creating scanner object */
		Scanner input = new Scanner(System.in);
		
		/* Creating integers and boolean for do/while loop */
		int x = 0;
		int y = 0;
		boolean b = true;
		
		
		/* Prompting the user to input both digits */
		System.out.print("Please enter two whole numbers: ");
		do {
			try {
				x = input.nextInt();
				y = input.nextInt();
				b = false;
			}
			/* Catching exceptions and asking user to re-input */
			catch (Exception ex) {
				System.out.println("Incorrect Input - Two whole numbers are required: ");
				input.nextLine();
			}
		} while (b);
		
		/* Printing the sum of both numbers */
		System.out.println("The sum is " + (x + y));
	}
}
