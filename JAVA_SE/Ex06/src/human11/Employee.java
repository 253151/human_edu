package human11;

public class Employee {
	public int eNo;
	
	public Employee(int eNo) {
		this.eNo = eNo;
		System.out.println(this.eNo +" 메모리생성");
	}
	public void finalize() throws Throwable {
		
		System.out.println (this.eNo+ " 메모리삭제");
		super.finalize();
	}
}
