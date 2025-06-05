package com.srikanth.streams;

public class Employe {
	private String designation;
	private double salary;
	private String empName;
	private Address address;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employe(String designation, double salary, String empName, Address address) {
		super();
		this.designation = designation;
		this.salary = salary;
		this.empName = empName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employe [designation=" + designation + ", salary=" + salary + ", empName=" + empName + ", address="
				+ address + "]";
	}
}
