	/* **********************************
	 * Objective: Create multiple classes which return information based of an individuals place in the school
	 * Algorithm: Create a class for each type of individual which resolves and returns all relevant information
	 * Input and Output: Putting in person(s) information, out comes back most of it
	 * Created by: Ivan B Torres
	 * Date: 6/10/2023
	 * Version: 1.0
	********************************** */
public class Project11 {
	/* Main method */
		public static void main(String[] args) {
			/* Create a Person, Student, Employee, Faculty, and Staff*/
			Person person = new Person("Aron", "12 Fake street", 
				"352-548-0626", "antonietta_lark@yahoo.com");

			Student student = new Student("David", "430 Real Ave", "360-747-3676", 
				"joel1999@gmail.com", Student.FRESHMAN);

			Employee employee = new Employee("Jamie", "50 Wast street", "502-500-9443",
				"anahi2016@gmail.com", 71, 40000);

			Faculty faculty = new Faculty("Lynette", "28 Wall street", "727-410-8189",
				"aiden1990@gmail.com", 20, 55000, "6pm to 7:30pm", "Teacher");

			Staff staff = new Staff("Tom", "Country Roads corner", "931-952-9557",
				"vilma_boyl9@yahoo.com", 1, 75000, "Priniciple");

			/* Invoke toString of Person, Student, Employee, Faculty and Staff */
			System.out.println(person.toString());
			System.out.println(student.toString());
			System.out.println(employee.toString());
			System.out.println(faculty.toString());
			System.out.println(staff.toString());
		}
	}

