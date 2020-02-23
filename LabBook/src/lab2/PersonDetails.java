package lab2;

import java.time.LocalDate;
import java.util.Scanner;

import com.ig.eis.myexception.BlankNameException;

class PersonDetails {
	private String firstname;
	private String lastname;
	private Gender gender;
	private String phoneno;
	private LocalDate dob;

	enum Gender {
		M, F;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public PersonDetails() {
		this.firstname = "Aaron";
		this.lastname = "";
		// this.gender = 'M';

	}

	public PersonDetails(String fn) {
		this.firstname = fn;
	}

	public PersonDetails(String firstname, String lastname, Gender g, String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = g;
		this.phoneno = phone;

	}

	public void display() {
		System.out.println("Person details");
		System.out.println("________________");
		System.out.println("First Name:" + this.getFirstname());
		System.out.println("Last Name:" + this.getLastname());
		System.out.println("Gender: " + this.getGender());
		System.out.println("Phone Number: " + this.getPhoneno());
		System.out.println("Age " + this.calculateAge(this.dob));
		System.out.println("Full Name: " + this.getFullName(this.getFirstname(), this.getLastname()));

	}

	public int calculateAge(LocalDate dob) {
		int year = Math.abs(dob.getYear() - LocalDate.now().getYear());
		return year;
	}

	public String getFullName(String fn, String ln) throws BlankNameException {

		if (fn.isEmpty() && ln.isEmpty()) {
			BlankNameException b = new BlankNameException("Name should not be null");
			throw b;
		} else {

			return fn + ln;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String fn = sc.nextLine();
		// String fn = null;
		System.out.println("Enter last name");
		String ln = sc.nextLine();
		// System.out.println("Enter gender");
		// char g = sc.next().charAt(0);
		System.out.println("Enter phone number");
		String p = sc.next();
		PersonDetails pd = new PersonDetails();

		pd.setFirstname(fn);
		pd.setLastname(ln);
		pd.setGender(Gender.M);
		pd.setPhoneno(p);
		pd.setDob(LocalDate.of(1999, 8, 01));
		// pd.display();
		// System.out.println(pd.calculateAge(dob));
		try {
			pd.getFullName(fn, ln);
			pd.display();
		} catch (BlankNameException b) {
			System.out.println(b.toString());
		}
		sc.close();
	}

	public static void checkName(String fn, String ln) throws BlankNameException {
		if (fn.isEmpty() && ln.isEmpty()) {
			BlankNameException b = new BlankNameException("Name should not be null");
			throw b;
		}
	}

	public String toString() {
		return "Name :" + this.getFirstname();

	}

}