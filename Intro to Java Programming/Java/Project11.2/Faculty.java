/* Making Faculty class */
public class Faculty 
		extends Employee {
	private String officeHours;
	private String rank;

	/* Making object with name, address, phone number, email, office, salary, office hours and rank */
	public Faculty(String name, String address, String phone, String email, 
		int office, double salary, String officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	/* Return officeHours */
	public String getOfficeHours() {
		return officeHours;
	}

	/* Set new officeHours */
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	/* Return rank */
	public String getRank() {
		return rank;
	}

	/* Set new rank */
	public void setRank(String rank) {
		this.rank = rank;
	}

	/* Returns string */
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +
		"\nRank: " + rank;
	}
}