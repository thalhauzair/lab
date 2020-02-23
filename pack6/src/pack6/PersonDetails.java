package pack6;

import java.util.Scanner;

public class PersonDetails 
{
	private String firstname;
	private String lastname;
	private String gender;
	private String phone;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone=phone;
	}
public PersonDetails(String firstname,String lastname,String gender,String phone)
{
	this.firstname=firstname;
	this.lastname=lastname;
	this.gender=gender;
	this.phone=phone;
}
public PersonDetails()
{
	this.firstname="";
	this.lastname="";
	this.gender="M";
	this.phone="9897867757";
}
public void fullName()
{
	String fn=firstname.concat(lastname);
	System.out.println("Fullname:"+fn);
}
public void display()
{
	 System.out.println("Person Details");
	 System.out.println("_______________");
	 System.out.println("Firstname:"+this.getFirstname());
	 System.out.println("Lastname:"+this.getLastname());
	 System.out.println("Gender:"+this.getGender());
	 System.out.println("Phone:"+this.getPhone());
}	 
public static void main(String[] args)
{
	 @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	 System.out.println("firstname:");
	  String firstname=sc.nextLine();
	  System.out.println("lastname:");
  String lastname=sc.nextLine();
	// String gender=sc.next();
	 PersonDetails pd=new PersonDetails();
	 try
	 {
		checkName(firstname,lastname);
	 }
	 catch(BlankNameException b)
	 {
		 System.out.println(b.toString());
	 }
	 pd.display();
	 pd.fullName();
}
	 public static void checkName(String firstname,String lastname) throws BlankNameException
	 {
		 if(firstname.isEmpty() && lastname.isEmpty())
		 {
			 BlankNameException b=new BlankNameException("name should not be null");
			 throw b;
		 }
	 }
	 public String toString()
	 {
		 return"Name:"+this.getFirstname();
	 }
	 public PersonDetails(String firstname)
	 {
		 this.firstname=firstname;
	 }

}

