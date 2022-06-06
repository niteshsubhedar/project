package com.mindgate.main.pojo;

public class RequirementRequestDetails {
	
	private int requirementRequestId;
	private String skill1;
	private String skill2;
	private String skill3;
	private int experience;
	private int vacancies;
	private String status;
	private String role;
	private ProjectDetails projectDetails ;
	private EmployeeDetails employeeDetails;

	public RequirementRequestDetails() {
		// TODO Auto-generated constructor stub
	}

	public RequirementRequestDetails(int requirementRequestId, String skill1, String skill2, String skill3,
			int experience, int vacancies, String status, String role, ProjectDetails projectDetails,
			EmployeeDetails employeeDetails) {
		super();
		this.requirementRequestId = requirementRequestId;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.experience = experience;
		this.vacancies = vacancies;
		this.status = status;
		this.role = role;
		this.projectDetails = projectDetails;
		this.employeeDetails = employeeDetails;
	}

	public int getRequirementRequestId() {
		return requirementRequestId;
	}

	public void setRequirementRequestId(int requirementRequestId) {
		this.requirementRequestId = requirementRequestId;
	}

	public String getSkill1() {
		return skill1;
	}

	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}

	public String getSkill2() {
		return skill2;
	}

	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}

	public String getSkill3() {
		return skill3;
	}

	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getVacancies() {
		return vacancies;
	}

	public void setVacancies(int vacancies) {
		this.vacancies = vacancies;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	@Override
	public String toString() {
		return "RequirementRequestDetails [requirementRequestId=" + requirementRequestId + ", skill1=" + skill1
				+ ", skill2=" + skill2 + ", skill3=" + skill3 + ", experience=" + experience + ", vacancies="
				+ vacancies + ", status=" + status + ", role=" + role + ", projectDetails=" + projectDetails
				+ ", employeeDetails=" + employeeDetails + "]";
	}
	
	
}
