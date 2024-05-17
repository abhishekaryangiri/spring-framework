package com.springcoreallvalueinbean.spring3core3;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String employeeDepartment;
	private String employeePhone;
	
	//gen. getter & setter
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
	public String getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}
	
	//generate constructor using field
	public Employee(int employeeId, String employeeName, String employeeDesignation, String employeeDepartment,
			String employeePhone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeDepartment = employeeDepartment;
		this.employeePhone = employeePhone;
	}
	
	//generate constroctors from superclass
	public Employee() {
		super();
	}
	
	//generate toString method
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeDepartment=" + employeeDepartment + ", employeePhone="
				+ employeePhone + "]";
	}
	
	
	
	

}
