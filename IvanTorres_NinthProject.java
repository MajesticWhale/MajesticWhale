	/* **********************************
	 * COSC 1173 Programming Lab
	 * Name: Ivan Torres
	 * Data: 3/14/2023
	 * Display array in forward and backwards order + the Maximum and Minimum + which are above/equal to the average and below the average
	********************************** */
import java.util.Scanner;

public class IvanTorres_NinthProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//create double for array
		int[] list = new int [10];
		//have user input the original array
		System.out.print("Please enter 10 numbers: ");
		for (int i=0; i<list.length;i++) {
			list[i] = input.nextInt();
		}
		//print input array
		System.out.print("\nThe input array is: ");
		for (int str : list) {
			System.out.print(str + " ");
		}
		
		//call reverseArray than print the reversed array
		reverseArray(list);
		System.out.print("\nThe new array is: ");
		for (int str : list) {
			System.out.print(str + " ");
		}
		//call all other methods to find solutions
		System.out.print("\nThe maximum is: " + max(list));
		System.out.print("\nThe minimum is: " + min(list));

		//Create list of numbers that are above or equal to the average
		int[] above = new int [aboveNum(list)];
		int j = 0;
		for (int i=0;i<list.length;i++) {
			if (list[i] >= average(list)) {
				above[j] = list[i];
				j++;
			}
		}
		
		//Print list numbers that are less than to the average
		System.out.print("\nThe numbers above or equal to the average are: ");
		for (int str : above) {
			System.out.print(str + " ");
		}
		
		//Create list of numbers that less than the average
		int[] below = new int [belowNum(list)];
		j = 0;
		for (int i=0;i<list.length;i++) {
			if (list[i] < average(list)) {
				below[j] = list[i];
				j++;
			}
		}
		
		///Print list of numbers that less than the average
		System.out.print("\nThe numbers less than the average are: ");
		for (int str : below) {
			System.out.print(str + " ");
		}
	
	}

	
	
	
	// Method reverse returns the is array in reverse
		public static void reverseArray(int[] a) {
			for (int i=0;i<a.length/2;i++) {
				int temp = a[i];
				a[i] = a[a.length-1-i];
				a[a.length-1-i] = temp;
			}
			
		}
	// Method max returns the is highest score
	public static int max(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
	// Method min returns the is lowest score
	public static int min(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}
	// Method average finds the average score for the list
	public static double average(int[] a) {
		double average = 0;
		for (int i = 0; i < a.length; i++) {
				average += a[i];
		}
		average = average / a.length;
		return average;
	}
	// Method establishes how many numbers are above or equal to the average
	public static int aboveNum(int[] a) {
		int aboveNum = 0;
		for (int i=0;i<a.length;i++) {
			if (a[i] >= average(a)) 
				aboveNum += 1;
		}
		return aboveNum;
	}
	// Method establishes how many numbers less than to the average
	public static int belowNum(int[] a) {
		int belowNum = 0;
		for (int i=0;i<a.length;i++) {
			if (a[i] < average(a)) 
				belowNum += 1;
		}
		return belowNum;
	}
}