package EmployeeManagement;

public class Employee {
	String name;
	int joinD;
	int dD;
	int workD;
	int workT;
	
	public Employee(String name, int joinD, int workD, int workT) {
		this.name = name;
		this.joinD = joinD;
		this.workD = workD;
		this.workT = workT;
		// D => Day, T => Time
		// 이름, 입사일자, 근무기간, 주당 근무일수, 근무시간
		
	}

}
