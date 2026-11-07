package com.demo;

class Employee{
	private int empId;
	private String name;
	private double basicSalary;
	private double hraPercentage = 12.5;
	private double daPercentage = 30.0;
	
	public Employee(int empId, String name, double basicSalary) {
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	public void setEmpId(int empId) {
		setEmpId(empId);
	}
	
	public void setName(String name) {
		setName(name);
	}
	
	public void setBasicSalary(double basicSalary) {
		setBasicSalary(basicSalary);
	}
	
	public void setHraPercentage(double hraPercentage) {
		setHraPercentage(hraPercentage);
	}
	
	public void setDaPercentage(double daPercentage) {
		setDaPercentage(daPercentage);
	}
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public double hra() {
		double hra = getBasicSalary() * (hraPercentage/100.0);
//		System.out.println("Your HRA:" + hra);
		return hra;
	}
	
	public double da() {
		double da = getBasicSalary() * (daPercentage/100.0);
//		System.out.println("Your DA: " + da);
		return da;
	}
	
	public void grossSalary() {
		double grossSalary = getBasicSalary() + hra() + da();
		System.out.println("HRA: " + hra());
		System.out.println("DA: " + da());
		System.out.println("Gross Salary: " + grossSalary);
	}
	
	
}
public class Main2 {
	public static void main(String[] args) {
		Employee emp = new Employee(254800, "Dhanish Kumar", 29999);
		emp.grossSalary();
	}
}
