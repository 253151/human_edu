package human11;

public class Employee02 {
	public String name;
	public int employeeId;
	public static int serialNum = 1000;
	// static은 class차원의 변수
	// 모든 객체가 공유하는 변수
	// 클래스가 로딩될 때 세팅되는 변수
	
	public Employee02(String name) {
		this.name = name;
		this.serialNum = this.serialNum + 1;
		this.employeeId = serialNum;
	}
	public void showInfo() {
		System.out.printf 
		("%s사원의 사번은 %d입니다. \n", this.name, this.employeeId);
	}
	
	
}
