package human14;

public class Student {
//	int number;
	
	private static Student s = new Student();
	// 외부에서 Student 클래스의 인스턴스 변수를 못만들도록
	// private로 막아놓고, 클래스 내부에서 s라는 인스턴스 변수를 미리 만들어놓음.
	
	private Student() {
		
	}
	
	public static Student getInstance() {
		
		return s;
	}

}
