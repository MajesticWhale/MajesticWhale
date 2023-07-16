	/* **********************************
	 * COSC 1173 Programming Lab
	 * Name: Ivan Torres
	 * Data: 5/3/2023
	 * Create rectangle objects and display their traits
	********************************** */
public class IvanTorres_TwelthProjectTest {
	public static void main(String[] args) {
		
		IvanTorres_TwelthProject[] circleArray;

	    // Create rectangleArray
	    circleArray = createCircleArray();

	    // Print rectangleArray and total areas of the circles
	    printCircleArray(circleArray);
	  }

	  /** Create an array of Rectangle objects */
	  public static IvanTorres_TwelthProject[] createCircleArray() {
		  IvanTorres_TwelthProject[] circleArray = new IvanTorres_TwelthProject[5];

	    for (int i = 0; i < circleArray.length; i++) {
	      circleArray[i] = new IvanTorres_TwelthProject(Math.random() * 100, i);
	    }

	    // Return Rectangle array
	    return circleArray;
	  }

	  /** Print an array of Rectangles and their total area */
	  public static void printCircleArray(IvanTorres_TwelthProject[] circleArray) {
	    for (int i = 0; i < circleArray.length; i++) {
	      System.out.println(circleArray[i].toString());
	    }

	  }

	  /** Add circle areas */
	  public static double sum(
			  IvanTorres_TwelthProject[] circleArray) {
	    // Initialize sum
	    double sum = 0;

	    // Add areas to sum
	    for (int i = 0; i < circleArray.length; i++)
	      sum += circleArray[i].getArea();

	    return sum;
	  }
}


		