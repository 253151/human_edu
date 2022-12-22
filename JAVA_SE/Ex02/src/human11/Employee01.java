package human11;

public class Employee01 {
	public String name;
	public int employeeId;
	public int serialNum = 1000;

	
	public Employee01(String name) {
		this.name = name;
		this.serialNum = this.serialNum + 1;
		this.employeeId = serialNum;
	}
	public void showInfo() {
		System.out.printf ("%s사원의 사번은 %d입니다.", this.name, this.employeeId);
	}
	
	
}
