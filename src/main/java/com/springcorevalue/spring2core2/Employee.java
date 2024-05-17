package com.springcorevalue.spring2core2;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String employeeDepartment;
	
	//generating getter & setter
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	
	
	//gen. constructor using field
	public Employee(int employeeId, String employeeName, String employeeDesignation, String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeDepartment = employeeDepartment;
	}

	
//generating constructor from superclass..
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//generating toString method
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeDepartment=" + employeeDepartment + "]";
	}
	
	

}
