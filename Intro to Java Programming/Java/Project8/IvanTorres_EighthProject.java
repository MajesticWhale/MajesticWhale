		/*-------------
		 * COSC 1173 Programming Lab
		 * Name: Ivan Torres
		 * Data: 3/1/2023
		 * converts from Celsius to Fahrenheit
		 ----------* */
public class IvanTorres_EighthProject
{
	public static void main(String[] args) {
	
		System.out.println("Celsius\t\tFahrenheit\n");
		
		for (double celsius = 40.0; 
			  celsius >= 31.0; celsius--) {
			System.out.printf("%.1f", celsius);
			System.out.printf("\t\t%.1f\n\n", celsiusToFahrenheit(celsius));
		}
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}
}
