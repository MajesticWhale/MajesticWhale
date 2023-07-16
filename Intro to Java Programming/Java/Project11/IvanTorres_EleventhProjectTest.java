import java.util.Scanner;

public class IvanTorres_EleventhProjectTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//print out all info for Rectangle 1
		IvanTorres_EleventhProject rectangle1 = new IvanTorres_EleventhProject(4, 40);
		
				System.out.println("--- Rectangle 1 ---");
				System.out.println("The width is " + rectangle1.getWidth());
				System.out.println("The length is " + rectangle1.getLength());
			    System.out.println("The area is " + rectangle1.getArea());
			    System.out.println("The perimeter is " + rectangle1.getPerimeter());
		
		//print out all info for Rectangle 2	    
	    IvanTorres_EleventhProject rectangle2 = new IvanTorres_EleventhProject(3.5, 35.9);

	    		System.out.println("--- Rectangle 2 ---");
	    		System.out.println("The width is " + rectangle2.getWidth());
				System.out.println("The length is " + rectangle2.getLength());
			    System.out.println("The area is " + rectangle2.getArea());
			    System.out.println("The perimeter is " + rectangle2.getPerimeter());

			}

		}
