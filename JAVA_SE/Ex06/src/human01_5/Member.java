package human01_5;

public class Member extends Object {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	
	// Object가 가지고 있는 equals를 오버라이딩 하여 아래와 같이 재정의함
	
	public boolean equals(Member m) {
		if (this.id == m.id ) {
			return true;
		}
		return false;
	}

}
