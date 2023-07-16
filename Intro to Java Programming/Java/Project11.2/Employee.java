/* Making Employee class */
import java.util.Random;

public class Employee
		extends Person {
	private int office;
	private double salary;
	

	/* Making Employee object */
	public Employee(String name, String address, String phone, 
		String email, int office, double salary) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
	}

	/* Return office */
	public int getOffice() {
		return office;
	}

	/* Return salaray */
	public String getSalary() {
		return String.format("%.2f", salary);
	}

	/* Return date hired */
	public String getDateHired() {
		Random rand = new Random();
		return (rand.nextInt(12) + 1) + "/" + (rand.nextInt(30) + 1) + "/19" + (rand.nextInt(50)+ 50);
	}

	/* Set new office */
	public void setOffice(int office) {
		this.office = office;
	}

	/* Set new salary */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/* Returns string */
	public String toString() {
		return super.toString() + "\nOffice: " + office + 
				 "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
}