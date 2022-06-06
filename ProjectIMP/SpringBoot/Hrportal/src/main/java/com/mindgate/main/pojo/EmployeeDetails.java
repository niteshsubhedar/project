package com.mindgate.main.pojo;

public class EmployeeDetails {
	 private int employeeId;
	 private String firstName;
	 private String lastName;
	 private int contactNumber;
	 private String designation;
	 private int salary;
	 private int projectId;
	 private String address;
	 private String city;
	 private String state;
	 private int pincode;
	 private int userId;
	 private LoginDetails loginDetails;
	 private ProjectDetails projectDetails;
	 
	 public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(int employeeId, String firstName, String lastName, int contactNumber, String designation,
			int salary, int projectId, String address, String city, String state, int pincode, int userId,
			LoginDetails loginDetails, ProjectDetails projectDetails) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.designation = designation;
		this.salary = salary;
		this.projectId = projectId;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.userId = userId;
		this.loginDetails = loginDetails;
		this.projectDetails = projectDetails;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public LoginDetails getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}

	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contactNumber=" + contactNumber + ", designation=" + designation + ", salary=" + salary
				+ ", projectId=" + projectId + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", userId=" + userId + ", loginDetails=" + loginDetails + ", projectDetails="
				+ projectDetails + "]";
	}
	 
	 
}
