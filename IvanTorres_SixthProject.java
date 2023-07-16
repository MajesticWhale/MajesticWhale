		/*-------------
		 * COSC 1173 Programming Lab
		 * Name: Ivan Torres
		 * Data: 2/15/2023
		 * Play with String objects
		 ----------* */
public class IvanTorres_SixthProject {

	public static void main(String[] args) {
		String college = new String ("PoDunk College");

		String town = new String ("Anytown, USA");
		
		int stringLength;
		String change1, change2, change3;
		
		stringLength = (college.length());
		
		System.out.println(college + " contrains " + stringLength + " characters.");
		
		change1 = college.toUpperCase();
		change2 = change1.substring(0,1)+'*'+change1.substring(2,8)+'*'+change1.substring(9);
		change3 = college.concat(town);
		
		System.out.println ("The final string is " + change3);
	}
}
