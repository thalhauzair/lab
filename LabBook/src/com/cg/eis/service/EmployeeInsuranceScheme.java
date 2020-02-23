package com.cg.eis.service;

interface EmployeeService {
	String insuranceDetails(double salary, String designation);
}

public class EmployeeInsuranceScheme implements EmployeeService {

	@Override
	public String insuranceDetails(double salary, String designation) {
		if(salary>5000 && salary<20000 && designation.equals("System Associate"))
			return " Scheme C";
		else if(salary>=20000 && salary<40000 && designation.equals("Programmer"))
			return "Scheme B";
		else if(salary>=40000&& designation.equals("Manager"))
			return "Scheme A";
		else if(salary<5000 && designation.equals("Clerk"))
			return "No Scheme";
		return null;
	}

}
