package human07_1;


public class Student {
	public int id;
	public String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int hashCode() {
		return id + this.name.hashCode();
	}
	public boolean equals(Object obj) {
		// Object obj = new Student(1,강현준);
		// 자동타입변환 
		// class Student 뒤에 extends Object가 생략되어 있다고 생각하면 됨. (Object가 최상위 클래스이기 때문에 상속 받음, 11장 참고)
		// hashCode와 equals를 재정의 하지 않으면 s1과 s4를 다른 객체로 인식하지만 재정의함으로써 같은 객체로 인식하게 됨.
		if(obj instanceof Student) {
			Student st = (Student) obj;
			if(this.id == st.id && this.name.equals(st.name)) {
				return true;
			}
		}
		return false;
	}
}
