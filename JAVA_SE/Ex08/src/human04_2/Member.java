package human04_2;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	public int hashCode() {
		// hash코드는 숫자이므로 문자에만 적용.
		return this.name.hashCode();
		// m1,m3는 나이는 다르지만 이름이 같기 때문에
		// 동일한 해시코드를 갖는다. (hashCode에 대해서는 이름으로만 정의)
	}
	public boolean equals(Object obj) {
		// Object obj = new Member("강현준",47);
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			// 자동타입변환후 강제타입변환
			if (this.name.equals(mem.name) );
			// 이름만으로 비교하기 때문에 m1,m3는 같은 것으로 인식함.
			return true;
		}
		return false;
	}
}
