package lab2;

import java.util.*;

public class Person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstname = sc.next();
		String lastname = sc.next();
		String gender = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		System.out.println("Person details");
		System.out.println("________________");
		System.out.println("First Name:" + firstname);
		System.out.println("Last Name:" + lastname);
		System.out.println("Gender" + gender);
		System.out.println("Age:" + age);
		System.out.println("Weight:" + weight);
		sc.close();
	}
}
