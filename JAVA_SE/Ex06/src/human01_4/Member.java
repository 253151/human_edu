package human01_4;

public class Member extends Object {
	public int age;
	public int score;
	
	public Member(int age, int score) {
		this.age = age;
		this.score = score;
	}
	
	// Object가 가지고 있는 equals를 오버라이딩 하여 아래와 같이 재정의함

//	@Override
	public boolean equals(Object obj) {
		// Member m = m2;
		// Object obj = m2 (--> new Member(47,90));
		// Object obj = new Member(47,90);
		// 자동타입변환 (자식객체>부모객체)
		if (obj instanceof Member) {
			Member m = (Member) obj;
			// 강제타입변환
			if (this.age == m.age && this.score == m.score) {
				return true;
			}
		}
		return false;
	}

}
