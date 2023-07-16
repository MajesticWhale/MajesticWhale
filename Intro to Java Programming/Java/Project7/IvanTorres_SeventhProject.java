		/*-------------
		 * COSC 1173 Programming Lab
		 * Name: Ivan Torres
		 * Data: 2/22/2023
		 * Print table converting Kilograms to Pounds
		 ----------* */
public class IvanTorres_SeventhProject {

	public static void main(String[] args) {
//establish int kilo
		int kilo = 1;
		
//print header
		System.out.println("----------------------------------------\n\tKilograms\tPounds\n----------------------------------------");
		
//creating the kilogram with pounds conversions
		while (kilo < 200) {
			System.out.print("\t" + kilo + "\t\t");
			System.out.format("%.1f\n", (kilo * 2.2));
			kilo += 2;
		}
		
//making last line dash
		System.out.print("----------------------------------------");
	}
}
