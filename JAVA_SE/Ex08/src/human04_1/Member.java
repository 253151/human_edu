package human04_1;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	public int hashCode() {
		// hash코드는 숫자이므로 문자에만 적용.
		return this.name.hashCode() + this.age;
		// m1,m3는 이름과 나이가 같기 때문에
		// 동일한 해시코드를 갖는다.
	}
	public boolean equals(Object obj) {
		// Object obj = new Member("강현준",47);
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			// 자동타입변환후 강제타입변환
			if (this.name.equals(mem.name) && this.age == mem.age);
			// this는 set안에 있는 객체를 의미함.
			return true;
		}
		return false;
	}
}
