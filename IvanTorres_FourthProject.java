		/*-------------
		 * COSC 1173 Programming Lab
		 * Name: Ivan Torres
		 * Data: 2/8/2023
		 * Generates random number between 1 through 12 than displays the English month that correlates with
		 ----------* */

//Importing Math
import java.lang.Math;

public class IvanTorres_FourthProject {

	public static void main(String[] args) {
		
//Generating the random number
		int month = (int)((Math.random() * 12) + 1);

//display the month name
		switch (month)
		{
		case 1: System.out.println("January"); break;
		case 2: System.out.println("February"); break;
		case 3: System.out.println("March"); break;
		case 4: System.out.println("April"); break;
		case 5: System.out.println("May"); break;
		case 6: System.out.println("June"); break;
		case 7: System.out.println("July"); break;
		case 8: System.out.println("August"); break;
		case 9: System.out.println("September"); break;
		case 10: System.out.println("October"); break;
		case 11: System.out.println("November"); break;
		case 12: System.out.println("December");
		}
	}
}
