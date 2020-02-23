package com.cg.eis.pl;

import com.cg.eis.bean.*;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.*;
import com.cg.eis.exception.EmployeeException;

import java.util.*;

public class DriverCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String name = sc.next();
		String designation = sc.next();
		double salary = sc.nextDouble();
		String insuranceScheme;

		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setDesignation(designation);
		// e.setSalary(salary);
		EmployeeInsuranceScheme eis = new EmployeeInsuranceScheme();
		insuranceScheme = eis.insuranceDetails(salary, designation);
		e.setInsuranceScheme(insuranceScheme);
		try {
			e.setSalary(salary);
			System.out.println("Employee id " + e.getId());
			System.out.println("Employee Name " + e.getName());
			System.out.println("Employee designation " + e.getDesignation());
			System.out.println("Employee salary " + e.getSalary());
			System.out.println("Employee insurance scheme " + e.getInsuranceScheme());
		} catch (EmployeeException emp) {
			System.out.println(emp.toString());
		}
		/*
		 * System.out.println("Employee id "+ e.getId()); System.out.println(
		 * "Employee Name "+ e.getName()); System.out.println(
		 * "Employee designation "+ e.getDesignation()); System.out.println(
		 * "Employee salary "+ e.getSalary()); System.out.println(
		 * "Employee insurance scheme "+ e.getInsuranceScheme());
		 */
	}

	public static void checkSalary(double salary) throws EmployeeException {
		if (salary < 3000) {
			EmployeeException e1 = new EmployeeException("Salary less than 3000");
			throw e1;
		}
	}
}
