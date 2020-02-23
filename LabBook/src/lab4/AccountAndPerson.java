package lab4;

import com.ig.eis.myexception.InvalidAgeException;

class Person {
	private String name;
	private float age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) throws InvalidAgeException {
		if (age < 15) {
			throw new InvalidAgeException("Age should be above 15");

		} else {

			this.age = age;
		}
	}
}

abstract class Account {
	private static long count = 0;
	private long accNum;
	private double balance;
	private Person accHolder;

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public abstract void withdraw(double amount);

	/*
	 * { balance -= amount; }
	 */
	public double getBalance() {
		return balance;
	}

	public Account() {
		accNum = ++count;
	}

	public String toString() {
		return "Account Holder name: " + this.accHolder.getName() + "\nAge: " + this.accHolder.getAge()
				+ "\nAccount Number: " + this.getAccNum() + " \nCurrent Balance: " + this.getBalance();
	}
}

class SavingsAccount extends Account {
	private final double minBalance = 1000;
	double bal;

	public void withdraw(double amount) {
		bal = super.getBalance();
		double bal1 = bal - amount;
		if (bal > minBalance && bal1 >= minBalance) {

			bal -= amount;
			super.setBalance(bal);
		} else {

			System.out.println(" You can withdraw upto  " + (bal - minBalance));
		}

	}
}

class CurrentAccount extends Account {
	public double overdraftLimit = -1000;
	double bal;

	public void withdraw(double amount) {
		bal = super.getBalance();
		double bal1 = bal - amount;
		if (bal > overdraftLimit && bal1 >= overdraftLimit) {

			bal -= amount;
			super.setBalance(bal);
			System.out.println("false");
		} else {

			System.out.println(" You can withdraw upto  " + (bal - overdraftLimit));
			System.out.println("overdraft amount reached");
		}

	}
}

public class AccountAndPerson {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Smith");

		Person p2 = new Person();
		p2.setName("Kathy");
		p2.setAge(21);

		CurrentAccount smithAcc = new CurrentAccount();
		smithAcc.setAccHolder(p1);
		SavingsAccount kathyAcc = new SavingsAccount();
		kathyAcc.setAccHolder(p2);
		smithAcc.setBalance(2000);
		kathyAcc.setBalance(5000);
		smithAcc.deposit(2000);

		System.out.println("The updated smith account balance is " + smithAcc.getBalance());
		// System.out.println("The updated kathy account balance is " +
		// kathyAcc.getBalance());
		// kathyAcc.withdraw(2000);
		// kathyAcc.withdraw(4500);
		// kathyAcc.withdraw();
		smithAcc.withdraw(6000);
		// System.out.println(smithAcc.toString());
		// System.out.println(kathyAcc.toString());

		try {
			p1.setAge(12);
			System.out.println(smithAcc.toString());

		} catch (InvalidAgeException e) {
			System.out.println(e.toString());

		}
	}
	/*
	 * public static void checkAge(float age )throws InvalidAgeException {
	 * if(age< 15) { throw new InvalidAgeException("Age should be above 15"); }
	 * 
	 * }
	 */
}
